package org.apache.commons.lang.time;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import java.time.Instant;
import org.evosuite.runtime.mock.java.time.MockInstant;
import java.time.Clock;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockClock;
import sun.util.calendar.ZoneInfo;
import java.time.ZoneId;
import java.time.ZoneOffset;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1658), 13, 13);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(13, 13, 13, 13, (-1658));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855187200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 10);
      boolean boolean0 = DateUtils.isSameInstant(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(0, 2734, 2734, 682, 682, 0);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2235), (-793), 0, 15, 2, 2765);
      Date date0 = DateUtils.addDays(mockDate0, 1725);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Sat Aug 21 15:48:05 GMT 398", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2739, 2739, (-213), 2739, 693, 8);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Fri Jan 01 00:00:00 GMT 4866", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Date date0 = DateUtils.round((Date) mockDate0, 5);
      assertEquals("Mon Jun 05 00:00:00 GMT 1905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1001, 1001, 1, 2756, 941);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=87,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3568));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-3568,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-988));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-988,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, (-856));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      MockDate mockDate0 = new MockDate(272, 272, 272);
      Date date0 = DateUtils.addSeconds(mockDate0, 272);
      assertEquals("Sat May 30 00:04:32 GMT 2195", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      MockDate mockDate0 = new MockDate(10, 10, 10, (-5021), (-1453), 0);
      Date date0 = DateUtils.addMonths(mockDate0, 10);
      assertEquals("Wed Apr 13 18:47:00 GMT 1910", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Date date0 = DateUtils.addHours(mockDate0, 5);
      assertEquals("Mon Jun 05 05:00:00 GMT 1905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      MockDate mockDate0 = new MockDate(487, (-1), 2269);
      Date date0 = DateUtils.add(mockDate0, 1, (-464));
      assertEquals("Mon Feb 15 00:00:00 GMT 2393", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 6, 2);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 47, 1001, (-1), (-1), 1001);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 47);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2297), (-2297), (-2297), (-2297));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 2122);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2297), (-2297), 2, (-2297));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 29);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 137);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001, 1001);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1013, 1013, 1013, 1013, 1013);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1013);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "*[IGQKQx?#k";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("*[IGQKQx?#k", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'I'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2297), (-2297), 2, (-2297));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 944);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000016, 2, 280000016, 2, (-3));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1578), (-1578), (-1578), 5, (-3424), 2869);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 60000, 60000, 60000, 60000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 60000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 2487);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2487 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1410);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1410 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 4 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 996, 996);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 20, 20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(7, 7, 146139496);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(7, (-392), (-2752));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar1, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 1001);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-4081));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -4081 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 3, 6);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61843564800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=96,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4, (-2542), 4, 1852, 1001, 1001);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-153));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-3566));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) date0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1001 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 47, 1001, (-1), (-1), 1001);
      mockGregorianCalendar0.set(47, (-1), 47, 10, (-36));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=47,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=16,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, 9);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=282,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 11);
      assertEquals("Fri Feb 14 20:21:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        DateUtils.round((Object) locale0, 10);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round it_IT
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 47, 1001, (-1), (-1), 1001);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1001);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 280000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 78);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "W";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("W", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("|9 X2oA_4t", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: |9 X2oA_4t
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("oId%f", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        DateUtils.parseDate(stringArray0[0], stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 1001, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)MockCalendar.getInstance();
      mockGregorianCalendar1.setGregorianChange(mockDate0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2014, 5, 386);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 2014, (-1294), 2014, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-106), 10, (-2032), 1, (-106));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 10);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-65661843600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=112,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=97,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855187200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392422400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-856));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Fri Feb 14 20:21:20 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, (-1), 12, 2056, 4251, 14);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 3617);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Jun 11 20:21:21 GMT 2083", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      MockDate mockDate0 = new MockDate((-2461), (-2461), (-2461));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-12), (-1), (-12));
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(date0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855843540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=98,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=41,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2032), 86400000, 86400000, 86400000, 86400000, (-2032));
      Date date0 = DateUtils.addMinutes(mockDate0, 1086);
      assertEquals("Thu Nov 26 17:32:08 GMT 7446443", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 4);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(279999998, 29, 29);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 29 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set((-719), (-1558), (-1558));
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 86400000, 86400000, 1001, 60000, 1001);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      mockGregorianCalendar0.setTimeInMillis(3600000L);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=234617676595200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7436708,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=76,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2791, (-1096), 0, (-1157), 1001, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, (-1), 0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392336000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 1);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1878, 1878, 1878, (-1607), 1878, (-1607));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addSeconds(date0, (-1607));
      boolean boolean0 = DateUtils.isSameDay(date0, date1);
      assertFalse(boolean0);
      assertEquals("Thu Oct 04 23:33:13 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "4";
      Date date0 = DateUtils.parseDate("4", stringArray0);
      Date date1 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameDay(date1, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2327), (-2126), 280000000);
      MockDate mockDate1 = new MockDate((-2327), (-2327), 2498);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, (Calendar) null);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-122), (-122), (-122), (-122), 11, 11);
      Date date0 = DateUtils.round((Date) mockDate0, 10);
      assertEquals("Thu Jun 25 22:11:00 GMT 1767", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-683L));
      Date date0 = DateUtils.truncate((Date) mockDate0, 1);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Mon Dec 01 00:00:00 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 280000000);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), (-1));
      Date date0 = DateUtils.addHours(mockDate0, (-1));
      assertEquals("Mon Nov 28 23:00:00 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), (-1));
      Date date0 = DateUtils.addDays(mockDate0, (-1));
      assertEquals("Mon Nov 28 00:00:00 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 3034, 499, 3034, 2013);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 86400000, (-2014), 1471, 1, 3);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-1523));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-940));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(279999998, 279999998, 279999998);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999998);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 117, (-1811), 127, (-1811), 1156);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1501);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Date and Patterns must not be null";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Date and Patterns must not be null", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 't'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      mockGregorianCalendar0.set(3, 3048, 3048);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 86400000, (-2014), 1001, 1, 3);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 1519);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 2013);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 497);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 477);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 86400000, 1001, 3600000, 3);
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 3600000, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 86400000, 86400000, 1001, 60000, 1001);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 86400000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 2014, 2014);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Date date0 = DateUtils.add(mockDate0, 5, 5);
      assertEquals("Sat Jun 10 00:00:00 GMT 1905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 4);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030374718680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 3766);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 3766 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2801, 2801, 2801);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=33831561600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3042,MONTH=0,WEEK_OF_YEAR=6,WEEK_OF_MONTH=6,DAY_OF_MONTH=30,DAY_OF_YEAR=30,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 2680);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000L);
      Date date0 = DateUtils.truncate((Object) mockDate0, 9);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 60000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 13, 1, 1, 0, 1);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 5);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 4225);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-1465));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 199);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 6 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 1, 1, 13, (-1884));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Could not round ", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "a";
      try { 
        DateUtils.parseDate("a", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: a
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate(" is not valid.", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        DateUtils.parseDate(stringArray0[0], stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1001, 1573, 2);
      DateUtils.isSameLocalTime(mockGregorianCalendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 86400000, 4, 2, 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=227189325484800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7201313,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1, 3600000, 33, 33);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1233, 33, (-4294));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 6404, 6404, 1, 6404);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 6404, 6404);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 86400000, 4, 2, 86400000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1000, 1001, 86400000, 2);
      Locale locale0 = Locale.FRENCH;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 2);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 2);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant(date0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1009, 1009, 1009, 1009, 1009, 1009);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1), (-1), (-1));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 2469, 3600000);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 86400000, 4, 2, 86400000);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addMonths(date0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000L);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 9);
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 4748);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addWeeks(date0, 101);
      assertEquals("Fri Jan 22 20:21:21 GMT 2016", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Date date0 = DateUtils.addMinutes(mockDate0, 5);
      assertEquals("Mon Jun 05 00:05:00 GMT 1905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 6, 6, 13, 14);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835884408985240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=188,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=14,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.set(0, (-1971), (-1971), (-1971), 86400000);
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(zoneInfo0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      System.setCurrentTimeMillis(1392411295320L);
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-272), (-1699), (-304));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Locale locale0 = Locale.CANADA_FRENCH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1417, 1417, 1417, 1001, (-287));
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) zoneInfo0, locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addSeconds(date0, 2014);
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant(date1, (Date) mockDate0);
      assertEquals("Fri Feb 14 20:54:55 GMT 2014", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(266, 266, 261);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, (-692), 280000000, 11, (-692));
      MockDate mockDate1 = new MockDate((-692), (-692), 1876, 1876, (-692), (-692));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.truncate(date0, 0);
      assertEquals("Mon Jan 01 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setFirstDayOfWeek((-272));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-272,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000, 277, 0, 277, 3600000, 3600000);
      Date date0 = DateUtils.round((Object) mockDate0, 14);
      assertEquals("Mon Jan 27 05:00:00 GMT 3601930", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      Instant instant0 = MockInstant.now(clock0);
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addMonths(date0, 1);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 2965);
      assertEquals("Sun Feb 16 21:46:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-1427));
      assertEquals("Fri Feb 14 20:21:19 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 2320);
      assertEquals("Thu May 22 12:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 25);
      assertEquals("Tue Mar 11 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 0, 1);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 279999977, (-1));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 14);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 24, 24, 193, 24);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1000);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 9);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = " is not valid.";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(" is not valid.", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'i'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(794, 794, 794, 1066, 4, 4);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(611, 611, (-7));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 30, 30, 30, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, (-1), 6, 6);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HOUR_OF_DAY
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1530), (-1530), (-1530));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1683);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-1643));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1643 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 529, 529);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-2983), (-2983));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2435, (-304), 2236, 2208, (-304));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=14074387200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2416,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1, 1);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61961910834000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=187,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=6,SECOND=6,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 636);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@4c4ec25f
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 613);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 613 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 598);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-22), 21, 58);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62801568000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=22,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=331,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.round(date0, 9);
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, (-1));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@64265116
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-2717));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -2717 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Date date0 = DateUtils.truncate((Object) calendar0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 1099);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2989), 6, 280000000, 3, (-2835));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, (-3064));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@79314617
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-8873462895904763616L));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 611);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-4581));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 6 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-2446));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "F";
      try { 
        DateUtils.parseDate("9{RTU2t3@", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 9{RTU2t3@
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "(H";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("(H", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Unable to parse the date: ", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        DateUtils.parseDate(stringArray0[0], stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      Calendar calendar1 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Locale locale0 = Locale.CHINESE;
      mockGregorianCalendar0.set(525, 525, (-133), 525, (-133));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, (-1665), (-2150), 44, 8);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-28098403200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1079,MONTH=7,WEEK_OF_YEAR=31,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=213,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, (-1665), (-2150), 44, 8);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 86400000, 10, 10, 284);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 1001, 1001, 1001);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-7), (-7), (-7), 611, 611, 611);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(632, 632, (-2117), 6, 632);
      Date date0 = mockGregorianCalendar0.getTime();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(date0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-906));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 3913);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-4363));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, (-1520));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addWeeks(date0, (-1311));
      assertEquals("Fri Dec 30 20:21:21 GMT 1988", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
  }
@Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(957, 957, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-29442096000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1037,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 5, 5, 60000, 3);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1298, 2539, (-3542), 1, 30);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2474), 52, (-2474));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1560, (-2474), (-1), (-2028), (-15), 13);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(35, 35, 1, 1001, 1000);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(879, (-249), 879);
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      MockDate mockDate0 = new MockDate(185, 1000, 0, 1000, 1000);
      Date date0 = DateUtils.addDays(mockDate0, 2096);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Tue Mar 08 08:40:00 GMT 2174", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      MockDate mockDate0 = new MockDate(86400000, 86400000, 1141);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getTime();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1335), (-1335), 5, (-1335), 5, 13);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-668), (-668), (-668), (-668), (-668));
      Date date0 = DateUtils.addSeconds(mockDate0, (-668));
      assertEquals("Mon Jun 03 16:40:52 GMT 1174", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4083), (-4083), (-4083), (-3274), 0);
      Date date0 = DateUtils.addMonths(mockDate0, (-4083));
      assertEquals("Sun Mar 12 14:00:00 GMT 2536", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addMinutes(mockDate0, 490);
      assertEquals("Thu Jan 01 08:10:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      MockDate mockDate0 = new MockDate(91, 5, 4, 4, 40, 1903);
      Date date0 = DateUtils.add(mockDate0, 2, 3600000);
      assertEquals("Tue Jun 04 05:11:43 GMT 1991", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999995, 11, (-5), 1365, (-5), 279999995);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1365);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-15), 1039);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-15), 1039);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 418);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2032), 1473, 0, (-468), (-1349));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-1349));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1586));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 6, 3600000, 1000, 6, 5);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1634), 12, 6, (-1634), 1230, (-15));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "orc.apache.commons.lang.time.Date^tils";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("orc.apache.commons.lang.time.Date^tils", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 86400000, 1, 5, 6);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 6);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 194);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-1073));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 787);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-443));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 12 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 9);
      assertEquals("Fri Feb 14 20:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 2920, 2920);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 1454, 1454);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3600000, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=9405144403200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=300007,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3600000, 1);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE, locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      assertFalse(calendar0.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 3934);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 3934 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 86400000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, (-796));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 5);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726616270729600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86405000,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 60000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 60000, 60000);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=3600000,MONTH=60000,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=60000,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3600000, 1);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=9405144230400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=300007,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=58,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60000, 1001, 60000, 1001, 1, 2);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 243452);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 21, 21);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 2010);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 2010 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-2332));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 1001);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 2435);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, 86400000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 1706);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("(s1\u0006wK.L2*pZ", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: (s1\u0006wK.L2*pZ
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      String[] stringArray0 = new String[13];
      stringArray0[0] = "X";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("X", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        DateUtils.parseDate((String) null, stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 60000, 60000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=113705829216000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3605164,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=107,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1, 60000, 2, 86400000, 86400000);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726468942572800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86400331,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=136,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 5, 5, 60000, 3);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61748006400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=13,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(975, 975, 0, 0, 11, 768627);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 60000, 60000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3600000, 86400000, 1, 1000, 1013, 1000);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addDays(date0, 1482);
      boolean boolean0 = DateUtils.isSameInstant(date1, date0);
      assertEquals("Wed Nov 05 00:00:00 GMT 1586", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant(date0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      MockDate mockDate0 = new MockDate(21, (-1039), 3);
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Wed Jan 01 00:00:00 GMT 1834", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(939, 3, 3, (-3322), 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2498), (-611), (-611), 8, (-611), 8);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 86400000, 1, 5, 6);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60000, 1, 60000, 3, 1, 2);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      MockDate mockDate0 = new MockDate(21, (-1039), 3);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, 11);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) iterator0, 60000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils$DateIterator@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1738), 5264, 52, 499, (-1738), (-2474));
      Date date0 = DateUtils.addHours(mockDate0, 1560);
      assertEquals("Sat Jan 14 13:20:46 GMT 601", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 355);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-443));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1384), 1, 1, (-1), (-2498), 2715);
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-1));
      assertEquals("Sat Jan 30 06:07:14 GMT 516", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 1000);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1384), 1, 1, (-1), (-2498), 2715);
      Date date0 = DateUtils.addWeeks(mockDate0, 1);
      assertEquals("Sat Feb 06 06:07:15 GMT 516", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 3600000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, 3, (-378), 1, 57);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Locale locale0 = Locale.PRC;
      Calendar calendar1 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar1, calendar0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1494, 15, (-1028), 15, (-965));
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2395, 2395, 2395);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2395, 2395, 2, 2395, (-182), 2395);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2451, 2451, 2451, 2451, 2451);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-2537), 0, 1362, (-2852), 1);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Instant instant0 = MockInstant.ofEpochMilli((-2480L));
      Date date1 = Date.from(instant0);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      MockDate mockDate0 = new MockDate(921, 921, 921);
      MockDate mockDate1 = new MockDate(921, 0, 0);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-5694), (-5694), 11, (-5694), (-5694), (-5694));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 0, 44);
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      MockDate mockDate0 = new MockDate(921, 921, 921);
      Date date0 = DateUtils.truncate((Object) mockDate0, 0);
      assertEquals("Fri Jan 01 00:00:00 GMT 2900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-2850));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-2850,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-995));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-995,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000L);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4492, 30, (-1748));
      Date date0 = DateUtils.addMinutes(mockDate0, (-1069));
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Fri Sep 15 06:11:00 GMT 6389", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2014, 0, 2014, 86400000, (-3307), (-3307));
      Date date0 = DateUtils.addYears(mockDate0, (-112));
      assertEquals("Wed Dec 20 15:57:53 GMT 13775", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 86400000);
      assertEquals("Fri Apr 13 20:21:21 GMT 1657900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, (-537), 14, 56);
      Date date0 = DateUtils.addMonths(mockDate0, 0);
      assertEquals("Tue Jul 12 14:56:00 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1068, 4267, 4266, 1068, 4266, 1068);
      Date date0 = DateUtils.add(mockDate0, 0, 492);
      assertEquals("Sun May 22 11:23:48 GMT 3335", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999963, (-1), 279999963, 279999963, (-1));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 44);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-193), (-193), (-412), (-193), (-193), 0);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-1441));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-1652), 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 10);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, (-2105), 3, (-2105), (-249));
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1485);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 3, 280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 2, 2);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-580), 5599, 14, 1001, 5599, 14);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 320);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-1431));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1773);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 0, 2013);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61993481918680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=186,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1001 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 12);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 356, 356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 3828, 3828);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1934, 0, (-1));
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Locale locale0 = Locale.US;
      Calendar calendar1 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar1, calendar0);
      assertFalse(calendar1.equals((Object)calendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(calendar0.equals((Object)calendar1));
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 521);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@78509cb7
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) stringArray0[0], (-554));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4);
      DateUtils.iterator((Object) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030433360000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 0, 44);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 11 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030433356000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1752));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1305L);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=187,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      Date date0 = DateUtils.round((Object) calendar0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-2579), 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 2820);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, 2300);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@138fc1f3
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) calendar0, 1362);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1362 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 3613);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, 280000000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@303563c8
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1, 1, 1);
      Date date0 = DateUtils.round((Object) mockDate0, 1);
      assertEquals("Fri Feb 01 00:00:00 GMT 1901", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 681);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-251));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1305L);
      Date date0 = DateUtils.round((Date) mockDate0, 1);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      String[] stringArray0 = Locale.getISOLanguages();
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Y", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'b'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      String[] stringArray0 = Locale.getISOLanguages();
      // Undeclared exception!
      try { 
        DateUtils.parseDate("pMSDHeh&(}[+5V/c", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'b'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("Qc", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: Qc
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("lDno", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        DateUtils.parseDate("", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      String[] stringArray0 = new String[13];
      // Undeclared exception!
      try { 
        DateUtils.parseDate(stringArray0[0], stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.add(1, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)mockGregorianCalendar0.clone();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 1949, 1949, 1949, 1949);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 10);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-56550913200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=177,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=356,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3279, 3279, 3279, 1916, 3279, (-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=50221468800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3561,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=167,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addSeconds(mockDate0, 1329);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Thu Jan 01 00:22:09 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      MockDate mockDate0 = new MockDate(641, 0, 641);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1305L);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2733), (-2733), (-2733));
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-478), 691, (-478), 691, (-2654));
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1305L);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addHours(date0, 11);
      assertEquals("Fri Oct 15 11:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 1962);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 44);
      assertEquals("Sun Mar 30 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getTime();
      Date date1 = DateUtils.addMilliseconds(date0, 1001);
      assertEquals("Fri Feb 14 20:21:22 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 2025);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
  }
@Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 11, (-286));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-1786));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1786 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(20, 20, 20, 20, 20);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3482, 12, (-85), 3482, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), (-1), 27, (-1), (-2364));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4057, (-3532), 4057, (-474), 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(366, 1, 86400000, 366, 1);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5563, 352, (-3491), 1809, (-541));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(5156, 5156, 5156);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, (-3269), 29);
      Date date0 = DateUtils.addWeeks(mockDate0, (-31));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Mon Jan 24 00:00:00 GMT 1633", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2778), (-2778), 51);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1242), 1398, 1398, (-1612), 44, (-1612));
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1124));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1124,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
      mockGregorianCalendar0.setFirstDayOfWeek((-1051));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1051,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=187,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.truncate((Object) date0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 1, 12);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 12);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=12,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=43,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1674));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1674,ERA=1,YEAR=7,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-649));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-649,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 1001);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.add(date0, 0, (-5510));
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 2669, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 4);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate(calendar0, 940);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 950, 950);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 2712);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-2167));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = " is not supported";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(" is not supported", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'i'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1, 6, 5096, 1000, (-1824), 1);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-300));
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 2014);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-2210));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-1711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-336));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-1353));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-2414));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -2414 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1809, 45, (-1337), (-541), (-1337));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1809,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=8,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 201, 201);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 1001, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1383, 1383, 1383, 327, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(890, 890, 1);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertFalse(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) ";~(v7", 60000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on ;~(v7
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 86400000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 13, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62038310400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=34,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Iterator iterator0 = DateUtils.iterator(date0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, (-1816));
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 1471);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 3349);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, 9);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 9);
      assertEquals("Wed Oct 09 00:00:00 GMT 9", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 4, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, (-228));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@6f14b4c1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-640));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -640 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 2362);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, (-2003));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@7904dcd4
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      DateUtils.truncate(date0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 2579);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 62);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = ")}M^w^";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(")}M^w^", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("gCFEA&H=}\u0006.ZdQ ", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate(";~(v7", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: ;~(v7
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("d&N!z*dvGHf'", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        DateUtils.parseDate(stringArray0[0], stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, (-900), 0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 3, 4, 3);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 3, 4);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1242), 1398, 1398, (-1612), 44, (-1612));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 73);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 73);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2145, 933, 73);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("[CmppqNebQk%oT");
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance(timeZone0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addWeeks(date0, 15);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertFalse(boolean0);
      assertEquals("Fri Jan 28 00:00:00 GMT 1583", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2005), 808, 15);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, (-1747));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Fri Aug 22 20:21:21 GMT 1980", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-444), 6, 6, 6, 6);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) null, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) mockDate0, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      // Undeclared exception!
      try { 
        dateUtils_DateIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.time.DateUtils$DateIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 6);
      assertEquals("Sat Feb 15 02:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1, (-1816));
      Date date0 = DateUtils.addSeconds(mockDate0, 747);
      assertEquals("Sun Feb 10 00:12:27 GMT 1895", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 6);
      assertEquals("Thu Feb 20 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addMilliseconds(date0, 7);
      assertFalse(date1.equals((Object)date0));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 867);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 6);
      assertEquals("Fri Feb 14 20:27:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
  }
}
