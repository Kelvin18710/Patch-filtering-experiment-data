package org.joda.time.tz;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.UTCProvider;
import java.io.PushbackInputStream;
import java.io.PrintStream;
import java.util.Locale;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateTimeZoneBuilder_ESTest extends DateTimeZoneBuilder_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset(684860399999L);
      assertEquals(32400000, int0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1478);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("0elu+xZG1++BBjsDW+", 26);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder2.toDateTimeZone("0elu+xZG1++BBjsDW+", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("RdH}", (-1510), (-1510), 2498, 'u', 'u', 994, 19, true, 25650000);
      dateTimeZoneBuilder1.setStandardOffset(623158436);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.toDateTimeZone("RdH}", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 117 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(53, 'x', 53, (-2739), 1687, false, (-2739));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: x
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      File file0 = MockFile.createTempFile("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", "org.joda.time.tz.DateTimeZoneBuilder$RuleSet");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$OfYear", (DataOutput) dataOutputStream0);
      assertEquals(8L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000000000000000000L);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("is not supported");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 1000L);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.joda.time.tz.DateTimeZoneBuilder$RuleSet", "org.joda.time.tz.DateTimeZoneBuilder$RuleSet");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 62035200000L);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("0#JLM0#u0+#I.,o_", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
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
  public void test_0010()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("i0t*oEAhdl,lta", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.ISOYearOfEraDateTimeField", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, 241L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
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
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(29152000);
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
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)120, 1601);
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
  public void test_0015()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "X{}t#c)!ji3s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      File file0 = MockFile.createTempFile("}!,?[r:rW@Znl'", "}!,?[r:rW@Znl'");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) mockFileInputStream0, "org.joda.time.tz.DateTimeZoneBuilder$Rule");
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
        DateTimeZoneBuilder.readFrom((DataInput) null, "v");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "org.joda.time.chrono.ISOYearOfEraDateTimeField");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", (-2348), 1568, 1568, '2', 1568, 5122, 1568, true, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 2
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("F_zU6b`", (DataOutput) dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      assertEquals(1392393600000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition(9223372036854775807L);
      assertEquals(684860399999L, long0);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition(684860400000L);
      assertEquals(684860399999L, long0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition((-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.previousTransition(0L);
      assertEquals((-891594000001L), long0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset(1000000000000000000L);
      assertEquals(28800000, int0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      int int0 = dateTimeZone0.getOffset((-9223372036854775808L));
      assertEquals(29152000, int0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getNameKey(30962844000000L);
      assertEquals("CST", string0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getNameKey((-9223372036854775808L));
      assertEquals("LMT", string0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getNameKey((-1254L));
      assertEquals("CST", string0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1721, 's', 623158436, 277, 5556, true, 161);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setFixedSavings("lGOO:-GAeU", 2138187181);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      File file0 = MockFile.createTempFile("subtrahend", "subtrahend", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("F_zjU6b`", (OutputStream) dataOutputStream0);
      assertEquals(8L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-2449));
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("F_zU6b`", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
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
  public void test_0035()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings(",39Olg;O.!7bd:w", 25650000, 25650000, (-1066), '<', 1900, (-1066), (-1066), false, 25650000);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 1000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-9223372036854775808L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "JnDA0i>aO`|/> !t-H");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isFixed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("RdH}", 19);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("RdH}", true);
      assertEquals("RdH}", dateTimeZone0.getID());
  }
@Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("-%d?J|u}y>", 25650000);
      dateTimeZoneBuilder0.setStandardOffset(59);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("\">/RCcjM]Z3v", false);
      assertEquals("\">/RCcjM]Z3v", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(0, '{', 0, 0, 1700, true, 1700);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: {
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 868, 868, 60000, '9', 868, 0, 2847, false, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 9
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.MutableInterval", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
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
  public void test_0047()  throws Throwable  {
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
  public void test_0048()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
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
  public void test_0049()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)98, 4209);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "cc]__1EJv\"9F:65J");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(0);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("2L.c#nm", true);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
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
  public void test_0053()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover((-2451), 'u', 3673, 2932, 24, true, 24);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder0.writeTo("oC~B#U& k", (OutputStream) dataOutputStream0);
      assertEquals(8, byteArrayOutputStream0.size());
      assertEquals("F\u0000\u0003UTC\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("No file directory provided");
      dateTimeZoneBuilder0.writeTo("", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
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
  public void test_0057()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("org.joda.time.MutableInterval", 1145, 67, 67, 'M', 1145, (-3501), 1145, true, 67);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: M
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 1121, 1121, 633, '$', 633, 0, (-442), false, (-442));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertTrue(dateTimeZone0.isFixed());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-974L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("}", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 63158400000L);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, (String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("qS<!B.&n", 499);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.tz.DateTimeZoneBuilder$Rule", (DataOutput) dataOutputStream0);
      assertEquals("F\u0000\bqS<!B.&n\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0001\uFFFD\u0000", byteArrayOutputStream0.toString());
      assertEquals(21, byteArrayOutputStream0.size());
  }
@Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("XuIhKU", 114);
      dateTimeZoneBuilder1.setStandardOffset(114);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder0.toDateTimeZone("UTC", false);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("", 1836);
      dateTimeZoneBuilder0.addRecurringSavings("", (-1794112422), 'u', 1836, 'u', 1057, 1057, 'u', false, (-1610612730));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("AET", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1057 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-2228), 'z', 0, 0, (-2228), true, (-2228));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: z
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 1806);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(117, 'u', (-1610612734), 2275, (-3192), true, 58);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addCutover(1806, 'u', 1806, 326, (-3192), false, 117);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder3);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 10L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream(" s--q");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("'A3-9jqq", (DataOutput) dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 1806);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(117, 'u', (-1610612734), 2275, (-3192), true, 58);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1610612734 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("UTC");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-1L));
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(114);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 60000L);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)68;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      long long0 = DateTimeZoneBuilder.readMillis(dataInputStream0);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(4026531840000L, long0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("AET", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockPrintStream mockPrintStream0 = new MockPrintStream("9z),<");
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
  public void test_0077()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        dateTimeZoneBuilder0.writeTo("", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-2132));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
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
  public void test_0080()  throws Throwable  {
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
  public void test_0081()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-26);
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
  public void test_0082()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "Fixing duplicate name key - ");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "Fixing duplicate name key -t");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "t");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      byteArrayInputStream0.skip(1052640L);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "*8aR");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("'A3-9jqq", (-2132), (-2132), (-2132), '\\', (-2132), (-1638), 1510, false, 12825000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: \\
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("am,PoGv?E8", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(128);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("UTC", false);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
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
  public void test_0090()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(957, 's', 957, 3337, 92, false, 92);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("n]|W4D1T.", 957);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Fixing duplicate name key - ");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("Fixing duplicate name key - ", (OutputStream) objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1073741824);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
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
  public void test_0094()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", (-2132), 1510, 307, '\\', (-3327), 307, 5, true, 12825000);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      MockFile mockFile0 = new MockFile("am,PoGv?E8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, 10000000000000L);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
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
  public void test_0097()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 63158400000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "*8aR");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "JqNLVpF|3|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("", (-1794112422), 'u', 1836, 'u', 1057, 1057, 'u', false, (-1610612730));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("AET", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1057 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 1806);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-1610612734), 'u', 1806, 58, 1057, false, (-1794112422));
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("", (-2433), (-1610612734), (-1610612734), 'u', 24, (-1794112422), (-1794112422), false, 117);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder0);
  }
@Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      String string0 = "#fSzi,%";
      dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", 15);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Fixing duplicate recurrent name key - ");
      try { 
        dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset((-1));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.setFixedSavings("ifzi,%", 15);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("UTC");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("~&=1LiJI!)&Jb%Q", (OutputStream) objectOutputStream0);
      dateTimeZoneBuilder2.writeTo("org.joda.time.chrono.GJDayOfWeekDateTimeField", (DataOutput) objectOutputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Xyp'Bt0r{mDJ)&", "org.joda.time.chrono.GJDayOfWeekDateTimeField");
      mockFile0.delete();
      MockFile.createTempFile("Xyp'Bt0r{mDJ)&", "e_SFAr;f@.c)~u.+`.{", (File) mockFile0);
      dateTimeZoneBuilder0.addCutover(192, 's', (-1177), (-1433), 386, true, 255);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover((-2), 's', 153692453, 4045, 1042, false, 33);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setStandardOffset(33);
      DateTimeZoneBuilder dateTimeZoneBuilder4 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder3.setFixedSavings("UTC", (-2));
      DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder1.setStandardOffset(4045);
      assertSame(dateTimeZoneBuilder5, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 7);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readMillis(dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*>J", (File) mockFile0);
      dateTimeZoneBuilder0.setStandardOffset((-1));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("org.joda.time.chrono.GJDayOfWeekDateTimeField");
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 60000L);
      assertEquals(4L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset((-1));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", 15);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("UTC");
      dateTimeZoneBuilder0.writeTo("(66cU;GCfS4-*]", (OutputStream) mockFileOutputStream1);
      dateTimeZoneBuilder2.writeTo("org.joda.time.chrono.GJDayOfWeekDateTimeField", (DataOutput) dataOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1000L);
      assertEquals(33L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setStandardOffset((-1));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.tz.DateTimeZoneuiler$Transition", (DataOutput) dataOutputStream0);
      dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", 15);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("UTC");
      dateTimeZoneBuilder0.writeTo("(66cU;GCfS4-*]", (OutputStream) mockFileOutputStream1);
      dateTimeZoneBuilder2.writeTo("org.joda.time.chrono.GJDayOfWeekDateTimeField", (DataOutput) dataOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 1000L);
      assertEquals(41L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("Fixing duplicate recurrent name key - ");
      dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) mockFileOutputStream1);
      assertNotSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.tz.DateTimeZoneuiler$Transition", (DataOutput) dataOutputStream0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("Fixing duplicate recurrent name key - ");
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockFileOutputStream1);
      dateTimeZoneBuilder0.writeTo("Invalid min days in first week: ", (DataOutput) dataOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-527L));
      assertEquals(25L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(442L);
      Duration duration0 = new Duration(1000L);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      duration0.withMillis(193L);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay(1000L, (Chronology) islamicChronology0);
      DateTime dateTime2 = dateTime1.withFields(yearMonthDay0);
      // Undeclared exception!
      try { 
        dateTime2.withMillisOfSecond((-4322));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -4322 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Duration duration0 = Duration.standardHours(442L);
      duration0.withMillis(442L);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay(442L, (Chronology) islamicChronology0);
      DateTimeZone.setDefault(dateTimeZone0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)61;
      byteArray0[1] = (byte) (-39);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DateTimeZone.forOffsetMillis((byte) (-39));
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("XYoL-Z", "XYoL-Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"XYoL-Z\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(442L);
      Duration duration0 = new Duration(1000L);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      duration0.withMillis(193L);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay(1000L, (Chronology) islamicChronology0);
      DateTime dateTime2 = dateTime1.withFields(yearMonthDay0);
      dateTimeZone0.getOffset((ReadableInstant) dateTime2);
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = null;
      int int0 = 1621;
      String string1 = "j774";
      String string2 = "[sQuH\\d@yC!}";
      String string3 = null;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(442L);
      Duration duration0 = new Duration(442L);
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) duration0);
      duration0.withMillis(193L);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 1, (Chronology) islamicChronology0);
      dateTime0.withFields(yearMonthDay0);
      dateTimeZone0.getOffset((ReadableInstant) dateTime1);
      DateTimeZone.setDefault(dateTimeZone0);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("gym&.Hf", "@4}#Y1:j#66y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"@4}#Y1:j#66y\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 1337;
      dateTimeZoneBuilder0.setStandardOffset(1337);
      String string0 = "";
      FileSystemHandling.shouldAllThrowIOExceptions();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      dataOutputStream0.writeChars("");
      try { 
        dateTimeZoneBuilder0.writeTo("", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "org.joda.time.LocalDateTime";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-1323), 'w', (-1323), 2442, 59, true, 59);
      dateTimeZoneBuilder1.setFixedSavings("org.joda.time.LocalDateTime", 843);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string1 = "Ux4";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Ux4");
      String string2 = "i~mE+~f`?/-?";
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.writeTo("i~mE+~f`?/-?", (OutputStream) mockFileOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1323 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "(66cU;GCfS4-*]");
      MockFile mockFile1 = new MockFile("");
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Fixing duplicate recurrent name key - /(66cU;GCfS4-*]");
      FileSystemHandling.createFolder(evoSuiteFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "Fixing duplicate recurrent name key - ";
      int int0 = (-581);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ", "(66cU;GCfS4-*]");
      MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "Fixing duplicate recurrent name key - ", (File) mockFile0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)66;
      dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", (-581));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("(66cU;GCfS4-*]", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "", (File) mockFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte)103;
      byteArray0[2] = (byte)115;
      byteArray0[3] = (byte) (-73);
      byteArray0[5] = (byte) (-58);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      dateTimeZoneBuilder0.writeTo(";><a/+", (DataOutput) dataOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("(66cU;GCfS4-*]", 1140);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("9DxRVDV n>>T-1");
      mockFile0.toURI();
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.setFixedSavings("^;u[iP(k~=P*$L_+", 15);
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)115);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      dateTimeZoneBuilder2.writeTo("3r(DlU`JnlN1L=", (OutputStream) pipedOutputStream0);
      dateTimeZoneBuilder1.writeTo("6(", (DataOutput) dataOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "org.joda.time.field.ImpreciseDateTimeField");
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "(66cU;GCfS4-*]");
      MockFile.createTempFile("org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "", (File) mockFile0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte)103;
      byteArray0[3] = (byte) (-73);
      byteArray0[5] = (byte) (-58);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      dateTimeZoneBuilder0.setFixedSavings("(66cU;GCfS4-*]", 1140);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9DxRVDV n>>T-1");
      mockFile0.toURI();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("^;u[iP(k~=P*$L_+", (byte) (-58));
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)115);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.base.BaseLocal", (OutputStream) pipedOutputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      assertEquals(29, pipedInputStream0.available());
      
      DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "org.joda.time.field.ImpreciseDateTimeField");
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1273));
      DateTimeZone.setDefault(dateTimeZone0);
      PeriodType.yearMonthDay();
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("*6pG.S<1c{Q.AxF+c", 66, 66, (-1158), ';', (-1273), 16, 66, false, 66);
      dateTimeZoneBuilder1.setFixedSavings("`^]^4]", 1);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setStandardOffset((-1725));
      dateTimeZoneBuilder0.setFixedSavings("`^]^4]", 1);
      dateTimeZoneBuilder3.setFixedSavings("Ye|I|d$-:wH\"u", 158);
      DateTimeZone dateTimeZone1 = dateTimeZoneBuilder2.toDateTimeZone(".", false);
      assertEquals(".", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ", "(66cU;GCfS4-*]");
      MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "Fixing duplicate recurrent name key - ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 17, 6, (byte)60, 's', 6, (byte)58, (byte)60, true, 20587500);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("", 80);
      DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder0.setStandardOffset((-2170));
      dateTimeZoneBuilder3.setFixedSavings("org.joda.time.chrono.GJDayOfWeekDateTimeField", (-2170));
      dateTimeZoneBuilder4.setFixedSavings("SP1::H4H(Gp&FH7", (-2170));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("Fixing duplicate recurrent name key - ", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 58 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addRecurringSavings((String) null, 1621, 1621, 1621, 's', 8, 1621, 292272984, false, 20587500);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings((String) null, 1621);
      DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder2.setStandardOffset(1621);
      DateTimeZoneBuilder dateTimeZoneBuilder5 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder3.setFixedSavings("String pool is too large", 2814);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder4.toDateTimeZone("String pool is too large", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1621 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "Fixing duplicate recurrent name key - ";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.tz.DateTimeZoneBuilder$Transition", (DataOutput) dataOutputStream0);
      dataOutputStream0.writeChars("Invalid min days in first week: ");
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("UTC", false);
      dateTimeZoneBuilder0.writeTo("Invalid min days in first week: ", (OutputStream) dataOutputStream0);
      int int0 = (-501);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addRecurringSavings("Invalid min days in first week: ", 67, 67, Integer.MIN_VALUE, 'C', 7, 256, 34, true, (-501));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.addCutover((-282), 'C', 103, 12, 103, false, (-581));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: C
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">dd`0");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.release();
      dataOutputStream0.writeChars("years");
      dateTimeZoneBuilder0.writeTo(">dd`0", (OutputStream) dataOutputStream0);
      dateTimeZoneBuilder0.writeTo("Fixing duplicate recurrent name key - ", (DataOutput) dataOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "org.joda.time.LocalDateTime";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1323));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-238), 'w', (-1323), 2442, 59, true, 59);
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)18;
      byteArray0[1] = (byte)91;
      byteArray0[4] = (byte)58;
      byteArray0[3] = (byte)60;
      boolean boolean0 = false;
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("org.joda.time.LocalDateTime", 2442, (byte)91, 17, 'w', 16, (-2038), 16, false, 17);
      dateTimeZoneBuilder3.setFixedSavings("org.joda.time.LocalDateTime", (-1323));
      DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder1.setStandardOffset((byte)60);
      String string1 = "org.joda.time.field.ScaledDurationField";
      dateTimeZoneBuilder4.setFixedSavings("org.joda.time.field.ScaledDurationField", 789);
      DateTimeZoneBuilder dateTimeZoneBuilder5 = dateTimeZoneBuilder3.addCutover((byte)18, 'w', 59, (byte)58, (byte)91, true, (byte)58);
      dateTimeZoneBuilder5.setFixedSavings("org.joda.time.LocalDateTime", 16);
      File file0 = MockFile.createTempFile("org.joda.time.LocalDateTime", "org.joda.time.LocalDateTime", (File) null);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile(file0, "&%KR{0$^Z<'I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"&%KR{0$^Z<'I\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ", "(66cU;GCfS4-*]");
      mockFile0.delete();
      MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "Fixing duplicate recurrent name key - ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addCutover(386, 's', 6, (-2), 386, true, 6);
      dateTimeZoneBuilder0.setStandardOffset(386);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder3.setFixedSavings("Fixing duplicate recurrent name key - ", 6);
      DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder3.setStandardOffset((-581));
      assertNotSame(dateTimeZoneBuilder4, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1323));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-238), 'w', (-1323), 2442, 59, true, 59);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder1);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)18;
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte)58;
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)58);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.LocalDateTime", (DataOutput) dataOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1323 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings((String) null, (-2110), (-2110), (-36), 's', 1556, (-2110), (-234), true, 3756);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings((String) null, (-234));
      dateTimeZoneBuilder2.setStandardOffset((-234));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("j?6H_q\u0002i", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1556 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1323));
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-238), 'w', (-1323), 2442, 59, true, 59);
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)18;
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte)58;
      byteArray0[3] = (byte)60;
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("org.joda.time.LocalDateTime", 2442, (byte)91, 17, 'w', 16, (-2038), 16, false, 17);
      dateTimeZoneBuilder3.setFixedSavings("org.joda.time.LocalDateTime", (-1323));
      DateTimeZoneBuilder dateTimeZoneBuilder4 = dateTimeZoneBuilder1.setStandardOffset((byte)60);
      dateTimeZoneBuilder4.setFixedSavings("org.joda.time.field.ScaledDurationField", 789);
      dateTimeZoneBuilder2.setFixedSavings("org.joda.time.field.ScaledDurationField", (byte)58);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.LocalDateTime", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1323 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-1323), 'w', (-1323), 2442, 59, true, 59);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("org.joda.time.LocalDateTime", 2442, (byte)91, 17, 'w', 16, (byte)18, 16, true, 17);
      dateTimeZoneBuilder3.setFixedSavings("org.joda.time.LocalDateTime", (-1323));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 16);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone("org.joda.time.LocalDateTime", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1323 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1140, 's', (-234), 157, (-234), true, 1963);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset((-1736));
      String string0 = "org.joda.time.YearMonthDay$Property";
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("org.joda.time.YearMonthDay$Property", 17887500);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("UTC", true);
      dateTimeZoneBuilder3.writeTo("UTC", (OutputStream) mockFileOutputStream0);
      MockFile mockFile0 = new MockFile((String) null, "ex");
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile(mockFile0, ";><a/+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \";><a/+\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "Invalid encoding";
      dateTimeZoneBuilder0.addRecurringSavings("Invalid encoding", 'w', 59, 7, 'w', 59, 2919, 'w', false, 1097);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pipedInputStream0, "5.&|5GcDdf0e:");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 6;
      int int1 = 2872;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[2] = (byte)90;
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
  public void test_0136()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ", "(66cU;GCfS4-*]");
      mockFile0.delete();
      MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "Fixing duplicate recurrent name key - ", (File) mockFile0);
      dateTimeZoneBuilder1.setFixedSavings("$/\"", 17);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/kelvin/PycharmProjects/experiment");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.chrono.StrictChronology");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.YearMonthDay$Property", (DataOutput) dataOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 86400000L);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", 16);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Fixing duplicate recurrent name key - ");
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockFileOutputStream0);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset(8);
      MockFile mockFile0 = new MockFile("-mV}*ZJ", "(66cU;GCfS4-*]");
      MockFile.createTempFile("(66cU;GCfS4-*]", "mlis", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("mlis", (-581));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<");
      dateTimeZoneBuilder0.writeTo("(66cU;GCfS4-*]", (OutputStream) mockFileOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.LocalDateTime", (-1323));
      dateTimeZoneBuilder1.addRecurringSavings("org.joda.time.LocalDateTime", (-1323), (-1323), (-238), 'w', (-1323), 2442, 59, true, 59);
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
  public void test_0140()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("ZoneInfoMap", "subtrahend");
      File file0 = MockFile.createTempFile("-mV}*ZJ", "org.joda.time.chrono.GJDayOfWeekDateTimeField", (File) mockFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo(";><a/+", (DataOutput) dataOutputStream0);
      dateTimeZoneBuilder0.setFixedSavings("Fixing duplicate recurrent name key - ", 15);
      String string0 = "UTC";
      MockFileOutputStream mockFileOutputStream1 = null;
      try {
        mockFileOutputStream1 = new MockFileOutputStream("ZoneInfoMap", false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      String string0 = "LNB7m{oTGR>1El";
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "LNB7m{oTGR>1El");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(32);
      String string0 = "lIz=&.";
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("lIz=&.", 2330);
      int int0 = 5789;
      boolean boolean0 = false;
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("lIz=&.", 2330, 32, 2, 'O', 2, 2098, 5789, false, 58);
      char char0 = 'y';
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder3.addCutover((-1317), 'y', 32, 32, 2098, false, (-1317));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: y
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      InputStream inputStream0 = null;
      String string0 = "-bp:#>Qhrg{^o1]X5W";
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "-bp:#>Qhrg{^o1]X5W");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.setDefault(dateTimeZone0);
      PeriodType.yearMonthDay();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-1273), '5', (-1273), 3, (-1273), false, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 5
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 2945;
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(2945);
      String string0 = "";
      int int1 = 0;
      dateTimeZoneBuilder1.setFixedSavings("", 0);
      int int2 = (-3393);
      int int3 = 0;
      char char0 = 'M';
      int int4 = (-3477);
      DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover((-3477), 'M', (-3393), (-141), (-1072), true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: M
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "";
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(190);
      dateTimeZoneBuilder0.writeTo("", (OutputStream) byteArrayOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("", 80, 80, (-1301), '/', 256, (-1301), (-1301), true, (-1301));
      String string1 = "";
      dateTimeZoneBuilder1.toDateTimeZone("", true);
      String string2 = "ReadablePartial objects must have matching field types";
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = (-25);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-25));
      String string0 = "";
      char char0 = 'm';
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addRecurringSavings("", (-25), (-25), (-25), 'm', 543, (-1912), (-1912), true, (-1860));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: m
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = (-581);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      String string0 = "org.joda.time.JodaTimePermission";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.JodaTimePermission", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.JodaTimePermission", (OutputStream) mockPrintStream0);
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "Invalid min days in first week: ");
      byte[] byteArray0 = new byte[7];
      MockFile.createTempFile("Invalid min days in first week: ", "Years", (File) mockFile0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, "Years");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 115;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings((String) null, 115, 115, 115, '#', 1000, (-372), (-372), true, (-372));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: #
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 217;
      char char0 = 'N';
      int int1 = 6;
      int int2 = 2872;
      boolean boolean0 = false;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "LNB7m{oTGR>1El");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-581));
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte) (-126);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, "Offset is too large");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
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
  public void test_0153()  throws Throwable  {
      DataInput dataInput0 = null;
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
  public void test_0154()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      MockFile mockFile0 = new MockFile("Invalid min days in first week: ", "(66cU;GCfS4-*]");
      File file0 = MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "-mV}*ZJ", (File) mockFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder1.writeTo("org.joda.time.tz.DateTimeZoneBuilder$Transition", (DataOutput) dataOutputStream0);
      dateTimeZoneBuilder1.setFixedSavings("#fSzi,%", 15);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("Fixing duplicate recurrent name key - ", true);
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockFileOutputStream1);
      dateTimeZoneBuilder0.writeTo("Invalid min days in first week: ", (DataOutput) dataOutputStream0);
      assertEquals(36L, file0.length());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      OutputStream outputStream0 = null;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Fixing duplicate name key - ", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 190;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(190);
      dateTimeZoneBuilder0.writeTo("", (OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "", (File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.toDateTimeZone("DateTimeZone.setProvider", false);
      dateTimeZoneBuilder0.setStandardOffset((-581));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Fixing duplicate recurrent name key - ", 15);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(471, 'A', 43, 471, 471, false, 256);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: A
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 1928;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(2177, '%', (-114), 2177, (-114), true, 1928);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: %
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) dataInputStream0, "org.joda.time.tz.DateTimeZoneBuilder$OfYear");
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
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(772);
      String string0 = null;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.toDateTimeZone((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
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
  public void test_0163()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-581));
      String string0 = "org.joda.time.chrono.GJDayOfWeekDateTimeField";
      String string1 = "org.joda.time.YearMonthDay$Property";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.joda.time.YearMonthDay$Property");
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ");
      MockFile.createTempFile("org.joda.time.chrono.GJDayOfWeekDateTimeField", "Fixing duplicate recurrent name key - ", (File) mockFile0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setFixedSavings("org.joda.time.YearMonthDay$Property", (-581));
      dateTimeZoneBuilder0.setStandardOffset(52);
      MockPrintStream mockPrintStream0 = new MockPrintStream("i'yO.");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(dataOutputStream0);
      dateTimeZoneBuilder2.writeTo("DateTimeZone.setProvider", (OutputStream) filterOutputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setFixedSavings("org.joda.time.chrono.GJDayOfWeekDateTimeField", 212);
      dateTimeZoneBuilder0.setFixedSavings("PST", 212);
      dateTimeZoneBuilder3.addRecurringSavings("E<,~Coa=a1x]l|", 1024, 52, 1024, 'u', (-581), 157, (-2174), false, 212);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.toDateTimeZone("PST", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -581 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(1140, 's', (-234), 157, (-234), true, 1963);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("", true);
      assertEquals("", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1074));
      int int0 = 0;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addRecurringSavings("c3keejPjj]V", (-1074), (-1074), 0, ';', 6767, 1145, 19, true, (-1074));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ;
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 0);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings("", 726, 726, 512, ' ', 80, (-2337), 0, false, (-1724));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setStandardOffset((-581));
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("Fixing duplicate recurrent name key - ", 15);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = (-1750);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", (-1750));
      int int1 = 1003;
      dateTimeZoneBuilder1.setStandardOffset(1003);
      dateTimeZoneBuilder1.addRecurringSavings("", (-1750), 12, 0, 'F', 0, 12, 0, false, 1003);
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getAvailableIDs();
      uTCProvider0.getZone("");
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
@Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(1213);
      dateTimeZoneBuilder0.setFixedSavings("DG{ke@.ZUP", 1791);
      MockFile mockFile0 = new MockFile("hCUzB2';`3?");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      dateTimeZoneBuilder1.writeTo("hCUzB2';`3?", (OutputStream) mockFileOutputStream0);
      assertEquals(31L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("8}OQp*nJGB", (-1619508306));
      dateTimeZoneBuilder0.addRecurringSavings("Tr+^SoZ9'BzX`;k", 300, 0, 1791, 'u', (-1056), 1791, (-1619508306), false, 98);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(16);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Tr+^SoZ9'BzX`;k", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1056 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 155, 0, 0, '|', 155, 0, 0, false, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: |
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1056L));
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 10000L);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        dateTimeZoneBuilder0.writeTo("X9W", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("org.joda.time.tz.DateTimeZoneBuilder$Transition", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.writeMillis((DataOutput) null, 63158400000L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
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
  public void test_0178()  throws Throwable  {
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
  public void test_0179()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1213, (byte)40);
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
  public void test_0180()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)99, (byte)99);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) byteArrayInputStream0, ")WlQIbNS*+\"i");
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
  public void test_0183()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("Fixing duplicate name key - ", 3710, 0, 0, ']', 0, 3710, 0, false, ']');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ]
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("-Summer", (DataOutput) dataOutputStream0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
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
  public void test_0186()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addCutover(8, 's', 8, (-176), 986, false, 24);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addCutover(1637, ']', 1637, 1637, 3710, true, 1637);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: ]
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("Fixing duplicate recurrent name key - ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dateTimeZoneBuilder0.writeTo("E:e7e@#8)\"9s7t4q+t", (OutputStream) dataOutputStream0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings((String) null, 26);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("Km=K;", false);
      assertEquals("Km=K;", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFile mockFile0 = new MockFile("G-M.~L#");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
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
  public void test_0191()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Tr+^SoZ9'BzX`;k", 0, 20503125, (-2251), '', 2, 0, (-2251), true, 20503125);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("Millis", (-1288));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      MockFile mockFile0 = new MockFile("G-M.~L#");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.writeTo("UTC", (OutputStream) mockFileOutputStream0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        DateTimeZoneBuilder.writeMillis(dataOutputStream0, (-1644L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      DateTimeZoneBuilder.writeMillis(dataOutputStream0, 5097600000L);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) pipedInputStream0, "dR");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0, 26);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) dataInputStream0, "hCUzB2';`3?");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertEquals("Asia/Shanghai", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.addRecurringSavings("Tr+^SoZ9'BzX`;k", 300, 0, 1791, 'u', (-1056), 1791, (-1619508306), false, 98);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(16);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("Tr+^SoZ9'BzX`;k", (DataOutput) objectOutputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1056 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.DateTimeZoneBuilder$Transition", 6);
      DateTimeZone dateTimeZone0 = dateTimeZoneBuilder1.toDateTimeZone("^+K`eUv~=v-8S(G1+`", true);
      assertEquals("^+K`eUv~=v-8S(G1+`", dateTimeZone0.getID());
  }
@Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.ZoneInfoProvider", 1133);
      dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      mockPrintStream0.append((CharSequence) "org.joda.time.tz.ZoneInfoProvider");
      MockPrintStream mockPrintStream1 = new MockPrintStream("org.joda.time.tz.ZoneInfoProvider");
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(1133, 'w', 1785, 1133, 1133, false, 1785);
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.addRecurringSavings("{ya~LUS`i5reK%mF", (-206), 115, 128, 'w', 1133, 119, 1133, true, 1133);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "p8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      MockPrintStream mockPrintStream2 = new MockPrintStream(mockPrintStream1, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream2);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-3503L));
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PrintStream printStream0 = mockPrintStream0.append('w');
      dateTimeZoneBuilder0.writeTo("p8", (OutputStream) mockPrintStream0);
      MockPrintStream mockPrintStream3 = new MockPrintStream(mockPrintStream2, false);
      ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(mockPrintStream3);
      ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("EE", (DataOutput) objectOutputStream2);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", (-3290));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      dateTimeZoneBuilder1.writeTo("Long.MIN_VALUE cannot be negated", (OutputStream) objectOutputStream0);
      dateTimeZoneBuilder1.setFixedSavings((String) null, (-374));
      dateTimeZoneBuilder0.writeTo("EE", (OutputStream) printStream0);
      assertEquals(29L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "p8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      MockPrintStream mockPrintStream2 = new MockPrintStream(mockPrintStream1, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream2);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-3503L));
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("EE", 0);
      MockPrintStream mockPrintStream3 = new MockPrintStream("EE");
      dateTimeZoneBuilder0.writeTo("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", (OutputStream) objectOutputStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@eB?HLl18n4aOGB", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "@eB?HLl18n4aOGB");
      MockPrintStream mockPrintStream1 = new MockPrintStream(printStream0, true);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(1133, 'w', 1785, 1133, 1133, false, 1785);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "p8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      boolean boolean0 = false;
      MockPrintStream mockPrintStream2 = new MockPrintStream(mockPrintStream1, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream2);
      char[] charArray0 = new char[9];
      charArray0[0] = 'h';
      charArray0[1] = 'B';
      charArray0[2] = '.';
      charArray0[3] = '\'';
      charArray0[4] = 'Y';
      charArray0[5] = 'n';
      charArray0[6] = 'Q';
      charArray0[7] = '-';
      charArray0[8] = '!';
      mockPrintStream2.print(charArray0);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-3503L));
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("EE", 0);
      dateTimeZoneBuilder1.toDateTimeZone("@eB?HLl18n4aOGB", true);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[0];
      try { 
        pipedOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(99);
      int int0 = 0;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sHU)X[R\"?V&j.:[oL");
      dateTimeZoneBuilder0.writeTo("(<'Y$5.", (OutputStream) mockFileOutputStream0);
      char char0 = 'c';
      boolean boolean0 = true;
      dateTimeZoneBuilder1.addRecurringSavings(":)l=H", 0, 58, (-594), 'c', 1893, 1893, 58, true, 16);
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, (String) null);
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
      String string0 = "org.joda.time.tz.ZoneInfoProvider";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.ZoneInfoProvider", 1133);
      dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Locale locale0 = Locale.GERMAN;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[1] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[2] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[3] = (Object) dateTimeZoneBuilder1;
      objectArray0[4] = (Object) "org.joda.time.tz.ZoneInfoProvider";
      objectArray0[5] = (Object) dateTimeZoneBuilder0;
      objectArray0[6] = (Object) dateTimeZoneBuilder0;
      objectArray0[7] = (Object) dateTimeZoneBuilder0;
      objectArray0[8] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      mockPrintStream0.format(locale0, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", objectArray0);
      MockFile mockFile0 = new MockFile("org.joda.time.tz.ZoneInfoProvider");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) mockFileInputStream0, "org.joda.time.tz.ZoneInfoProvider");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Locale locale0 = Locale.GERMAN;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[1] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[2] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      objectArray0[4] = (Object) "org.joda.time.tz.ZoneInfoProvider";
      objectArray0[5] = (Object) dateTimeZoneBuilder0;
      objectArray0[6] = (Object) dateTimeZoneBuilder0;
      objectArray0[7] = (Object) dateTimeZoneBuilder0;
      objectArray0[8] = (Object) "org.joda.time.tz.DateTimeZoneBuilder$DSTZone";
      mockPrintStream0.format(locale0, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", objectArray0);
      MockFile mockFile0 = new MockFile("org.joda.time.tz.ZoneInfoProvider");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) mockFileInputStream0, "org.joda.time.tz.ZoneInfoProvider");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid encoding
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      dateTimeZoneBuilder0.setFixedSavings("UTC", 4011);
      DateTimeZone.getDefault();
      MockFile mockFile0 = new MockFile("UTC");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Object[] objectArray0 = new Object[0];
      mockPrintStream0.format(locale0, "", objectArray0);
      MockFile mockFile1 = new MockFile("");
      File file0 = MockFile.createTempFile("GMT", "UTC");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) mockFileInputStream0, "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(99);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sHU)X[R\"?V&j.:[oL");
      dateTimeZoneBuilder0.writeTo("(<'Y$5.", (OutputStream) mockFileOutputStream0);
      dateTimeZoneBuilder1.addRecurringSavings(":)l=H", 0, 58, (-594), 'c', 1893, 1893, 58, true, 16);
      String string0 = null;
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((DataInput) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 4011);
      MockFile mockFile0 = new MockFile("UTC");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockPrintStream0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("UTC", false);
      MockFileOutputStream mockFileOutputStream1 = null;
      try {
        mockFileOutputStream1 = new MockFileOutputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "p8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      MockPrintStream mockPrintStream2 = new MockPrintStream(mockPrintStream1, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream2);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-3503L));
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      mockPrintStream0.append('w');
      dateTimeZoneBuilder0.writeTo("p8", (OutputStream) mockPrintStream0);
      MockPrintStream mockPrintStream3 = new MockPrintStream(mockPrintStream2, false);
      ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(mockPrintStream3);
      ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(mockPrintStream0);
      dateTimeZoneBuilder0.writeTo("EE", (DataOutput) objectOutputStream2);
      dateTimeZoneBuilder0.setFixedSavings("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", (-3290));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      PipedOutputStream pipedOutputStream1 = null;
      try {
        pipedOutputStream1 = new PipedOutputStream(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.ZoneInfoProvider", 1133);
      dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "org.joda.time.tz.ZoneInfoProvider");
      MockPrintStream mockPrintStream1 = new MockPrintStream(printStream0, true);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder0.addCutover(1133, 'w', 1785, 1133, 1133, false, 1785);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
      assertSame(dateTimeZoneBuilder2, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "org.joda.time.tz.ZoneInfoProvider";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.ZoneInfoProvider", 1133);
      dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile("org.joda.time.tz.ZoneInfoProvider");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) mockFileInputStream0, "org.joda.time.tz.ZoneInfoProvider");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeZoneBuilder.readFrom((InputStream) null, "org.joda.time.format.PeriodFormatterBuilder");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", "p8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      MockPrintStream mockPrintStream2 = new MockPrintStream(mockPrintStream1, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream2);
      DateTimeZoneBuilder.writeMillis(objectOutputStream0, (-3503L));
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 0;
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("EE", 0);
      int int1 = 0;
      char char0 = 'z';
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addRecurringSavings("@eB?HLl18n4aOGB", (-1075), 0, 0, 'z', 0, 0, 0, true, (-1075));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: z
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
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
  public void test_0217()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("org.joda.time.tz.ZoneInfoProvider", 1133);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(1133);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.joda.time.tz.ZoneInfoProvider", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "org.joda.time.tz.ZoneInfoProvider");
      MockPrintStream mockPrintStream1 = new MockPrintStream(printStream0, true);
      dateTimeZoneBuilder2.writeTo("org.joda.time.tz.ZoneInfoProvider", (OutputStream) mockPrintStream1);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte) (-42);
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte) (-128);
      pipedOutputStream0.write(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      DateTimeZoneBuilder.readMillis(dataInputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((byte)9);
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-128);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-42);
      byteArray0[5] = (byte)117;
      pipedOutputStream0.write(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      DateTimeZoneBuilder.readMillis(dataInputStream0);
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-1492));
      assertSame(dateTimeZoneBuilder1, dateTimeZoneBuilder0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(99);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sHU)X[R\"?V&j.:[oL");
      dateTimeZoneBuilder0.writeTo("(<'Y$5.", (OutputStream) mockFileOutputStream0);
      boolean boolean0 = true;
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.addRecurringSavings(":)l=H", 0, 58, (-594), 'c', 1893, 1893, 58, true, 16);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder2.addCutover((-2055), 'c', 305, (-2055), 24, true, (-594));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: c
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", (-856));
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover((-856), '8', 0, 0, 0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: 8
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "";
      int int0 = 32;
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", 32);
      int int1 = 0;
      char char0 = '#';
      int int2 = 1998;
      int int3 = 4068;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.addCutover(0, '#', 0, 1998, 4068, true, 4068);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: #
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "";
      int int0 = 716;
      boolean boolean0 = true;
      int int1 = 713;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 716, 716, 716, '\'', 716, 716, 716, true, 713);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: '
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 0;
      int int1 = 292272992;
      char char0 = '&';
      boolean boolean0 = false;
      int int2 = 1149;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("0WwhS1SL4kXy<]& ", 0, 2234, 292272992, '&', 292272992, 0, 292272992, false, 1149);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: &
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      int int0 = 17971875;
      dateTimeZoneBuilder0.toDateTimeZone("", true);
      DataOutput dataOutput0 = null;
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.writeTo("", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "UTC";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("UTC", 4011);
      MockFile mockFile0 = new MockFile("UTC");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      dateTimeZoneBuilder1.writeTo("UTC", (OutputStream) mockPrintStream0);
      boolean boolean0 = true;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("UTC", false);
      MockFileOutputStream mockFileOutputStream1 = null;
      try {
        mockFileOutputStream1 = new MockFileOutputStream((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = "tm3ia|9qJK2x<";
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("tm3ia|9qJK2x<", 4011);
      MockFile mockFile0 = new MockFile("tm3ia|9qJK2x<");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      dateTimeZoneBuilder1.writeTo("tm3ia|9qJK2x<", (OutputStream) mockPrintStream0);
      dateTimeZoneBuilder0.setFixedSavings("tm3ia|9qJK2x<", 4011);
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("tm3ia|9qJK2x<", "tm3ia|9qJK2x<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"tm3ia|9qJK2x<\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset((-856));
      MockPrintStream mockPrintStream0 = new MockPrintStream("WQP'TvX|a&}B<=@(vv");
      mockPrintStream0.append('8');
      try { 
        dateTimeZoneBuilder1.writeTo("X5bFkUW`ZfF5KrQ ", (OutputStream) pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder0.addRecurringSavings("", 716, 716, 716, '\'', 716, 716, 716, true, 716);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode: '
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder$OfYear", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings(" hp1;anzqK-YC1kB-.", 1093);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(1093);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" hp1;anzqK-YC1kB-.", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      MockFile mockFile0 = new MockFile(" hp1;anzqK-YC1kB-.");
      DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder2.setStandardOffset(0);
      assertSame(dateTimeZoneBuilder3, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.addRecurringSavings("Fixing duplicate recurrent name key - ", 16, 16, (-423), 'w', (-423), 3419, 3419, true, 16);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(16);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder2);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setFixedSavings("", (-856));
      MockPrintStream mockPrintStream0 = new MockPrintStream("XY5bFkUW`sZfF5kKrQ ");
      dateTimeZoneBuilder0.writeTo("", (OutputStream) mockPrintStream0);
      assertSame(dateTimeZoneBuilder0, dateTimeZoneBuilder1);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      DateTimeZoneBuilder dateTimeZoneBuilder1 = dateTimeZoneBuilder0.setStandardOffset(32);
      DateTimeZoneBuilder dateTimeZoneBuilder2 = dateTimeZoneBuilder1.setStandardOffset(32);
      dateTimeZoneBuilder2.addRecurringSavings("", 32, 51, (-4522), '~', 0, 0, 32, false, 51);
      dateTimeZoneBuilder0.toDateTimeZone("org.joda.time.DurationField", false);
      // Undeclared exception!
      try { 
        dateTimeZoneBuilder1.writeTo("", (DataOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.tz.DateTimeZoneBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      DateTimeZoneBuilder dateTimeZoneBuilder0 = new DateTimeZoneBuilder();
      String string0 = null;
      String string1 = "";
      MockRandomAccessFile mockRandomAccessFile0 = null;
      try {
        mockRandomAccessFile0 = new MockRandomAccessFile("**pa=;<g#N+@^", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }
}
