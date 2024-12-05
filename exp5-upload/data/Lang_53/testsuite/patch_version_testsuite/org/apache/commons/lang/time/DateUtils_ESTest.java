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
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import java.time.ZoneId;
import java.time.ZoneOffset;
import sun.util.calendar.ZoneInfo;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import java.time.Clock;
import java.time.Instant;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-164), 23, 11);
      Locale locale0 = Locale.CANADA_FRENCH;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-878), 0, (-878), (-878), (-878), (-878));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-839), (-1700), 8, 1174, 1174);
      Date date0 = DateUtils.add(mockDate0, 8, (-113));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Sat Apr 26 17:34:00 GMT 917", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-15), (-15), (-15), (-15), (-15));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1616), "W!R\n");
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      calendar0.setMinimalDaysInFirstWeek((-1616));
      Calendar calendar1 = DateUtils.truncate(calendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=W!R\n,offset=-1616,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=-1616,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-1616,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, (-1687), (-1687), (-1687), (-1687));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-66680064000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=144,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 0, 0, 280000000);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.round(date0, 10);
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1326), "Could not truncate ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1326));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465601326,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Could not truncate ,offset=-1326,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=-1326,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-1326,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3525L));
      MockDate mockDate1 = new MockDate(2013, 1265, 1265, 1265, 1265, 2013);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addYears(mockDate0, (-95));
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      MockDate mockDate0 = new MockDate(14, 14, 0, 0, 14, 0);
      Date date0 = DateUtils.addSeconds(mockDate0, 14);
      assertEquals("Sun Feb 28 00:14:14 GMT 1915", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 3);
      assertEquals("Fri Feb 14 23:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 6);
      assertEquals("Thu Feb 20 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999914, 9, 9);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 279999914);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280001792, (-1557), (-1557));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-1557));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280001796, 3, 176, 1247, 4);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 790);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 992);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 1633);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-1064));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999870, 279999870, 279999870, 279999870, 279999870);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 279999870);
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
      String[] stringArray0 = new String[1];
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
  public void test_0024()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280001796, 3, 3, 3, 280001796, 3);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 3);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280001803, 280001803, 5);
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
  public void test_0026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 7);
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
  public void test_0027()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, (-796));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 113);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 141);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.set(1993, 531, 1993, 2700, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2303985801320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2043,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=3,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-771), (-771), (-771), (-771));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-64232927460000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=67,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=200,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999914, (-2441), (-2984), (-2441), (-2441));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-2984));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 2702, 2702);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 16, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
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
  public void test_0040()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) calendar0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator(calendar0, (-750));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -750 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-3357));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1436));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 6);
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Fri Jul 06 00:00:00 GMT 1906", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280001602, 280001602, (-1213));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-1213));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 6);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 280444487);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 280444487 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-2904));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 371);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 2663);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      DateUtils.truncate(date0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) "", (-15));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 2013);
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
        DateUtils.round((Calendar) null, 0);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-1590));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("[z", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: [z
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String[] stringArray0 = new String[17];
      stringArray0[0] = "\"m";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("\"m", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
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
  public void test_0067()  throws Throwable  {
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
  public void test_0068()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-15), (-1846), 628, (-15), (-1846), 628);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(628, 628, (-1846), 628, (-1846), 628);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 12, 1, 1, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 1, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3868), (-3868), 8, 674, 674, (-791));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(11, (-791), (-1734), 11, (-267));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
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
  public void test_0073()  throws Throwable  {
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
  public void test_0074()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 1, 1, 1, (-2783));
      boolean boolean1 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
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
  public void test_0076()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
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
  public void test_0078()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 637);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri May 01 20:21:21 GMT 2026", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
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
  public void test_0080()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"";
      Date date0 = DateUtils.parseDate("\"", stringArray0);
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
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
  public void test_0082()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1326), "Could not truncate ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465601326,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Could not truncate ,offset=-1326,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-1326,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 0);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1323), 6, (-1323), 2014, (-2467), 419);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
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
  public void test_0086()  throws Throwable  {
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
  public void test_0087()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
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
  public void test_0088()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Date) null, (Date) mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
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
  public void test_0092()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1160);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 2558);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"";
      Date date0 = DateUtils.parseDate("\"", stringArray0);
      Date date1 = DateUtils.addMonths(date0, 5);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-1088));
      assertEquals("Fri Feb 14 20:21:20 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-4476));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
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
  public void test_0099()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 29);
      assertEquals("Fri Feb 14 20:50:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
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
  public void test_0101()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000014, (-261), 2484, (-261), 2484);
      mockGregorianCalendar0.add(1, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 0, 0, (-89));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3481, 5, (-2214), 8, 5, (-2214));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=47504880000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3475,MONTH=4,WEEK_OF_YEAR=21,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=136,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(441, "\".*6kqzC");
      Locale locale0 = Locale.KOREA;
      Calendar calendar1 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 0, 0, (-89));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Date date0 = DateUtils.round((Object) calendar0, 0);
      Date date1 = DateUtils.addWeeks(date0, 4);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertEquals("Wed Jan 29 00:00:00 GMT 2014", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1001, 1001, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1703), (-1572), (-1703), 0, (-819), 0);
      Date date0 = DateUtils.addDays(mockDate0, (-1572));
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Tue Jan 11 10:21:00 GMT 57", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, (-2147483641), 3613, 3163, (-1), (-1));
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      calendar0.setLenient(false);
      Calendar calendar1 = DateUtils.truncate(calendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1315));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1315,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      mockGregorianCalendar0.setFirstDayOfWeek((-465));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-465,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 6, 6, 6);
      Date date0 = DateUtils.addSeconds(mockDate0, 6);
      assertEquals("Fri Jul 06 06:06:06 GMT 1906", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 2946);
      assertEquals("Sun Feb 16 21:27:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 1465);
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.add(date0, 0, 0);
      assertNotSame(date0, date1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000014, (-261), 3123, 3123, 3123);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(275368441, 253518396, 253518396, 343, (-141));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 275368441);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      mockGregorianCalendar0.set(0, 262);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-693));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000014, (-261), 280000014, (-261), 280000014);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 35);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000011, (-329), (-329), 280000011, (-329));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-329));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0127()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000014, 280000014, 2484, 280000014, 2484);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 2484);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "^Jr:68g{|wF>!OB";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("^Jr:68g{|wF>!OB", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'J'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      mockGregorianCalendar0.set(0, 262);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0132()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1018);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 2381);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-2286));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -2286 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-141), (-141), 1);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1703), (-1572), (-1703), 0, (-819), 0);
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      assertEquals("Thu Jan 01 00:00:00 GMT 61", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-1826), (-1826));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-141), (-141), 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-112), 1, (-141), (-112), 1, (-112));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 400, 400);
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
  public void test_0144()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertFalse(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 13);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@f496f8e
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) calendar0, 2263);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2263 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 5);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 5, 5);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, (-6150));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -6150 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(6, 33, 33);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.PRC;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 2147483644);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      Date date0 = DateUtils.round((Object) calendar0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000011, 280000011, 11);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 5);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 454);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 454 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 6);
      Date date0 = DateUtils.truncate((Object) mockDate0, 9);
      assertEquals("Fri Jul 06 00:00:00 GMT 1906", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 3273);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) "", 1409);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 1513);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        DateUtils.round((Object) locale0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round de_DE
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 2928);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-816));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      MockDate mockDate0 = new MockDate(148);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 148);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 148 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      String[] stringArray0 = new String[18];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("lII^vEk", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[0] = "Y";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Y", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
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
  public void test_0176()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  public void test_0177()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.clear();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1001, 3600000, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(838, 838, 838);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(838, 838, 838, 838, 0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000014, (-307), 2451, (-307), 2451);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(280000014, (-307), 280000014, 280000014, (-307));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(233402094, 233402094, 233402094, 233402094, 233402094, 233402094);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 11);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8000205158775600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=253518379,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=102,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
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
  public void test_0184()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
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
  public void test_0186()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 499, 1, (-1), 1083, 2767);
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
  public void test_0188()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
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
  public void test_0190()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 1500);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Fri Nov 14 20:21:21 GMT 2042", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_0192()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant((Date) null, (Date) mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2147483644, 2147483644, 217, 5, 871, 2147483644);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-6781805389411200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=214900476,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=91,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1466), (-1466), (-1466), (-1466), (-1466));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar1, 0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
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
  public void test_0197()  throws Throwable  {
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
  public void test_0198()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
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
  public void test_0200()  throws Throwable  {
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
  public void test_0201()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, (-1445), (-1445), (-1445));
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62138467745000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=10,WEEK_OF_YEAR=49,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=335,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=30,SECOND=55,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
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
  public void test_0203()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 8, 3570, 3570, 1001, 0);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61572575940000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=18,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=310,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=41,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 1598);
      assertEquals("Tue Apr 22 10:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 4647);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-2393));
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
        DateUtils.addMilliseconds((Date) null, 4287);
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
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 4);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
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
  public void test_0211()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(3600000, DateUtils.MILLIS_IN_HOUR);
  }
@Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2466), (-2343), 2612);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-93), 2612, (-93));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3949, 3949, (-4348), (-4348), 3949);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2424, (-4348), (-4348), 3949, 0, (-1));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, (-2147483643), 2687, (-15), 2687);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1928), (-1928), (-1928), 727, (-1928), (-1928));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 7, 7);
      Date date1 = DateUtils.addMinutes(date0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date1);
      assertFalse(boolean0);
      assertEquals("Fri Feb 21 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 2147478534);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Mon Apr 24 02:21:21 GMT 246997", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-556), 111, 14, 1687, 2);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1751), (-1751), (-2005), (-2005), 11);
      Date date0 = DateUtils.truncate((Date) mockDate0, 11);
      assertEquals("Sun May 13 11:11:00 GMT 4", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 5, (-1892), 5, (-1892));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62160220800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=24,DAY_OF_YEAR=84,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-2997));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 10);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-2997,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-983));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-983,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 3387, 0, (-98), 813);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 0);
      assertEquals("Tue Jan 01 00:00:00 GMT 9", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 1706, 1706, 1508, 6);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Iterator iterator0 = DateUtils.iterator(date0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 1127);
      assertEquals("Fri Sep 21 20:21:21 GMT 2035", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2354), (-2354), (-2354));
      Date date0 = DateUtils.addSeconds(mockDate0, (-2354));
      assertEquals("Tue May 21 23:20:46 GMT 658", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999991, (-2603), 279999991);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 279999991);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999993, 279999993, 279999993, 279999993, 279999993, 499);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999993);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999993, (-2341), (-693));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 26);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
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
  public void test_0232()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-588), (-588), (-588));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-588));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999991, 279999991, 279999991);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999991);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "SQs";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("SQs", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'Q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 5, 86400000, 1, 4);
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
  public void test_0236()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999998, 279999998, 279999998, 279999998, 1, 279999998);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
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
  public void test_0238()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1000);
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
  public void test_0239()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3112, 3112, 1, 1994, (-2639), (-66));
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
  public void test_0240()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0, 0);
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
  public void test_0241()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-2329));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 1315);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 1260);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 249395);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-786));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -786 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 1408);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1408 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 21 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 51, 51);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 40, 40);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(5, 5);
      TimeZone timeZone1 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 5, 6, 3, 3);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 1, 1, 5, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
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
  public void test_0255()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Calendar calendar0 = DateUtils.round((Calendar) gregorianCalendar0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, gregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135596800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 1000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, (-15));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -15 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 5, 2);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62059564800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=5,WEEK_OF_YEAR=22,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=153,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 5, 86400000, 3, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=7402994967840000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=236561,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=209,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 2, 4, 60000, 6, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1831471344364000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=60007,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=7,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=6,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, 1, 1, 1, 1);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 3628, (-4367));
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sun May 15 00:00:00 GMT 2191", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000, 3, 1001, 5, 2, 1);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Mon Dec 01 00:00:00 GMT 3601902", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 1000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 9);
      assertEquals("Fri Feb 14 20:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 71);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
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
  public void test_0275()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 249395);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999998, 279999998, 279999998, 279999998, 1, 279999998);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 279999998);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 1554);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000, 1, 1000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 4 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-537));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-232));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("UM|IWaO", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[0] = " y";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(" y", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "a;";
      try { 
        DateUtils.parseDate("a;", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: a;
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
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
  public void test_0286()  throws Throwable  {
      String[] stringArray0 = new String[14];
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
  public void test_0287()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-182), 5, 2583);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-182), 4, 86400000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 339, (-1), 3600000, 0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1845103449600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=60439,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 5, 86400000, 3, 4);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 5, 86400000, 1000, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999998, (-2343), (-2343));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(279999998, (-2343), (-18), (-2343), (-18), (-2343));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 339, (-1), 3600000, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
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
  public void test_0295()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1258), 3600000, (-462), 3, (-208));
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
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
  public void test_0297()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
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
  public void test_0299()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 10);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Fri Feb 14 20:21:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_0301()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
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
  public void test_0303()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 1217);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Sat Feb 15 16:38:21 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 5, 6, 3, 3);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-95), (-2367), (-640), 146139496, (-586));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-1), (-1), 7, 7, 0);
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
  public void test_0306()  throws Throwable  {
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
  public void test_0307()  throws Throwable  {
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
  public void test_0308()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
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
  public void test_0310()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
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
  public void test_0312()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 537);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3254));
      Date date0 = DateUtils.addMonths(mockDate0, 3153);
      assertEquals("Wed Dec 31 23:59:56 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 2);
      assertEquals("Sun Feb 16 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 32);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3254));
      Date date0 = DateUtils.addYears(mockDate0, 1);
      assertEquals("Wed Dec 31 23:59:56 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-3133));
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
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 4);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2856, 2856, 2);
      mockGregorianCalendar0.set(279999916, 1018, 2, 1010, 1010, (-4232));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-4232));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -4232 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1626), 1402, 0, 1705, (-1626), (-1973));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(279999954, (-1), 1274, 1705, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1746, (-2374), (-149), (-1677), (-457), 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1746, 1746, 1746, (-457), 1746, 764);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-13330154220000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1547,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=23,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, (-1483));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Sun Dec 15 01:21:21 GMT 2013", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.set(11, 10, 8);
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 1001, 1001);
      Date date0 = DateUtils.truncate((Date) mockDate0, 1001);
      assertEquals("Mon Apr 09 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999913, 1, 1, 1, (-964), 1);
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=279999913,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-1097), 3992, (-2113), (-1097));
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=0,YEAR=81,MONTH=0,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=92,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-1097), 3992, (-2113), (-1097));
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=0,YEAR=81,MONTH=0,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=92,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      MockDate mockDate0 = new MockDate(14, 0, 0, 3600000, 0);
      Date date0 = DateUtils.addMonths(mockDate0, 0);
      assertEquals("Sun Sep 07 00:00:00 GMT 2324", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 1028);
      assertEquals("Fri Feb 14 20:21:22 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 27);
      assertEquals("Thu Mar 13 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, (-1486), 146139496, 5, 146139496, 1);
      Date date0 = DateUtils.add(mockDate0, (-835), 0);
      assertEquals("Wed May 15 23:16:01 GMT 402171", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999904, 279999904, 1647, 1647, (-964), 1647);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999904);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999963, (-2374), (-4044), (-2310), 479, 279999963);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 14);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000002, 280000002, 280000002, (-1298), 280000002, 280000002);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 280000002);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-2551));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "b";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("b", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'b'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999977, (-2335), (-4080), (-2310), 479, 279999977);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 1);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1, 1);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 4, 4, 4, 1001);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MINUTE
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999963, 2824, 279999963, 2, 2229);
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
  public void test_0345()  throws Throwable  {
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
  public void test_0346()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(41, 41, 29, 2396, 1000);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 854);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 714);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 2987);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 283);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 283 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1, 1);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      Iterator iterator0 = DateUtils.iterator(calendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 35 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-396), (-396));
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-3272), (-3527));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2368), (-268), (-268), (-1), 3, 1493);
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
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
  public void test_0361()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1001 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, (-933));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@41f1797
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030433356000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
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
  public void test_0372()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-3227));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9, 9, 9, 9, 9, 9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sun Oct 10 00:00:00 GMT 1909", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      Date date1 = DateUtils.round(date0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 2833, 280000000, 2833, 919);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 919);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 40);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 40 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
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
  public void test_0379()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 1);
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
        DateUtils.truncate((Calendar) null, 1649);
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
        DateUtils.truncate((Date) null, (-3453));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-2551));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -2551 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 858);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 35);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-4089));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-738), (-738), (-738), (-738), (-738), (-738));
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Sat May 22 17:00:00 GMT 1098", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      String[] stringArray0 = new String[12];
      stringArray0[0] = "5S";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("5S", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("n|?tqg9912zWS.ly", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
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
  public void test_0392()  throws Throwable  {
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
  public void test_0393()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.set(0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(935, 935, 29);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2189), (-2189), (-2189), 0, (-2189));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(967, (-484), (-2189), (-484), 0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2189), (-2189), (-2189), (-2189), (-2189));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(967, (-484), (-2189), (-484), (-2189), (-2189));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.truncate(calendar0, 9);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392379200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
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
  public void test_0399()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
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
  public void test_0401()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(909, 909, 909);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
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
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
      Locale locale0 = Locale.ROOT;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.round(calendar0, 9);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar2 = MockCalendar.getInstance(timeZone0);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar2);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3917, 3917, 3917, 14, 14);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate((-2313), (-2313), (-2335));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 2, 2, (-1));
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
  public void test_0414()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3504), (-3504), 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-181959868800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3797,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
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
  public void test_0420()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1957), 229, 0);
      Date date0 = DateUtils.addSeconds(mockDate0, 0);
      assertEquals("Mon Jan 31 00:00:00 GMT 39", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 280000000);
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
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1968);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-738));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1957), 229, 0);
      Date date0 = DateUtils.addYears(mockDate0, 1748);
      assertEquals("Mon Jan 31 00:00:00 GMT 39", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1899, 3849, 1899, 6, 6, (-1055));
      Date date0 = DateUtils.addWeeks(mockDate0, (-1055));
      assertEquals("Mon Sep 22 05:48:25 GMT 4104", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1957), 229, 0);
      Date date0 = DateUtils.addMinutes(mockDate0, (-1666));
      assertEquals("Sat Jan 29 20:14:00 GMT 39", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000025, (-1174), (-1174), 1990, 1990, (-1174));
      mockGregorianCalendar0.add(2, 910);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835884393151026000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=50,SECOND=26,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1, 4, 4, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(108, 2797, 108);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3182, 1, 1, 1, 10, 3182);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(279999872, 2605, (-245));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 3912167, 86400000, 2393, 4, (-1829));
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-1929), (-1929), (-2928));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addDays(date0, 687);
      boolean boolean0 = DateUtils.isSameInstant(date1, date0);
      assertFalse(boolean0);
      assertEquals("Sat Jan 02 20:21:21 GMT 2016", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addDays(date0, 2654);
      boolean boolean0 = DateUtils.isSameDay(date1, date0);
      assertFalse(boolean0);
      assertEquals("Sat Jan 20 00:00:00 GMT 1590", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1836), 6, 6);
      MockDate mockDate1 = new MockDate((-2399), 2, 2867, 3279, (-1878));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2526), (-2526), (-2526), 0, (-253), 530);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=0,YEAR=2745,MONTH=6,WEEK_OF_YEAR=31,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=211,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=7,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      calendar0.setMinimalDaysInFirstWeek((-1));
      Calendar calendar1 = DateUtils.truncate(calendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1310L);
      Date date0 = DateUtils.addYears(mockDate0, 3983);
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-253), (-364), 0, (-4388), (-253), 2);
      Date date0 = DateUtils.addSeconds(mockDate0, 3061);
      assertEquals("Tue Mar 01 00:38:03 GMT 1616", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 1006);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 1761);
      assertEquals("Sun Feb 16 01:42:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.add(mockDate0, 5, 9);
      assertEquals("Sat Jan 10 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000032, 280000032, 51);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 280000032);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999996, 279999996, 10);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999996);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-42), (-42), 4203, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-42));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999995, 279999995, 279999995);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 279999995);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round(calendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000014, 280000014, 7, 7, 280000014, 280000014);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000014);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 1970);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // SECOND
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "V'*2q`S";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("V'*2q`S", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'V'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2915), (-2915), (-2915), (-1929), (-1929), (-2915));
      mockGregorianCalendar0.set(0, (-1929));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000006, 280000006, 280000006, (-2786), 280000006, 280000006);
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
  public void test_0455()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 901);
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
  public void test_0456()  throws Throwable  {
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
  public void test_0457()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-2928));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-2928), (-2928), (-2928));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-2928));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -2928 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 449);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 449 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 0, 0);
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
  public void test_0465()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 9);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar1, calendar0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392292800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2124, 638, (-5493), (-554), (-3096), (-554));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-1950), (-1950), (-2928));
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
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
  public void test_0469()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Locale locale0 = Locale.FRENCH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1247);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000006, (-1536), (-1536), (-2786), (-1536), (-1536));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835880399963104000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=279999873,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=172,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=58,SECOND=24,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-1929), (-1929), (-2928));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-162528227868000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3182,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=277,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=2,SECOND=12,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(18, 18, 18, 18, 18);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61550602920000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=19,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=4,DAY_OF_MONTH=18,DAY_OF_YEAR=199,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=18,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
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
  public void test_0479()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 3279);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, 3, 5, 1000, 1001, 60000);
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
  public void test_0481()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9, 9, 9, 9, 9);
      mockDate0.setTime(9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9, 9, 9, 9, 9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sun Oct 10 00:00:00 GMT 1909", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 6, 6);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000025, (-995), 3, 4, 3);
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
  public void test_0485()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 86400000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 1001);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 606);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 606 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-1004));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 1001, 6);
      Date date0 = DateUtils.truncate((Date) mockDate0, 1001);
      assertEquals("Tue Jun 06 00:00:00 GMT 1989", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1000 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) "", 12);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 1899);
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
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-151));
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "y})";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("y})", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("Dq]", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: Dq]
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
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
  public void test_0501()  throws Throwable  {
      String[] stringArray0 = new String[4];
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
  public void test_0502()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 0, 1001);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(18, 18, 18, 18, 18);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-138), 4, 18, 4, 1036);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 1001);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1074, 2014, 1074, 320, (-57), 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(18, 18, 18, 18, 18, 18);
      Locale locale0 = Locale.ITALIAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000006, (-1536), (-1536), (-2786), (-1536), (-1536));
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
  public void test_0507()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
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
  public void test_0509()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-2786), (-2786), (-2786), (-2786), (-2786));
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1495, 15, (-1950), 1627, (-2928), 1);
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
  public void test_0511()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-1929), (-1929), (-2928));
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
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
  public void test_0513()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4);
      Date date0 = DateUtils.addWeeks(mockDate0, 4);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Thu Jan 29 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      String[] stringArray0 = new String[5];
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
  public void test_0515()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
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
  public void test_0517()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
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
  public void test_0520()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-74L));
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
  public void test_0521()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
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
  public void test_0523()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167564800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2928), (-2928), (-2928), (-1929), (-1929), (-2928));
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
  public void test_0525()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator((Object) calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.addHours(mockDate0, 1001);
      assertEquals("Sun Apr 08 17:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 7);
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
        DateUtils.addMonths((Date) null, 561);
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
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 9);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1738);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-2059));
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
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 384);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-65), 1995, (-39), (-39), 1995);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 1995);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1995 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726621670297600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86405171,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 3600000, 4);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addHours(date0, 21);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertEquals("Sat Feb 15 17:21:21 GMT 2014", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3600000, 86400000, 5);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(13, 86400000, (-1681), 86400000, 12);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(12, (-864), 12, 550, 13, 550);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 5, 5, 1, 2, 5);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=5,WEEK_OF_YEAR=23,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=156,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-3563L));
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.round(date0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 1969", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 5, 5, 1, 2, 5);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=5,WEEK_OF_YEAR=23,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=156,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-346));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-346,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(29, 4, 1, 33, 60000, 11);
      DateUtils.iterator((Object) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61238069989000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=29,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=164,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=11,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addYears(date0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60000, 3, 3600000, 4341, 3, 211);
      Date date0 = DateUtils.addSeconds(mockDate0, (-382));
      assertEquals("Tue Mar 15 21:00:09 GMT 71757", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-1), 0, 0, 0);
      Date date0 = DateUtils.addMonths(mockDate0, 0);
      assertEquals("Thu Nov 30 00:00:00 GMT 1899", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, (-1));
      assertEquals("Fri Feb 14 20:20:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-3544));
      assertEquals("Fri Feb 14 20:21:17 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, (-1), 0, 0, 0);
      Date date0 = DateUtils.addDays(mockDate0, 0);
      assertEquals("Thu Nov 30 00:00:00 GMT 1899", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000022, (-1953), (-1953), (-1953), (-366), (-366));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-366));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-75), 1969, (-39), (-39), 1969);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 1969);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000037, (-69), (-69), (-5), (-5), (-69));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-5));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
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
  public void test_0556()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 29);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 29);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "e*";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("e*", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'e'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
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
  public void test_0560()  throws Throwable  {
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
  public void test_0561()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-3));
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
  public void test_0562()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 326);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1925, 0, 1925, 1409, 0, 843);
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 843, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 3600000, 1001);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 13, 737);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 737);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3658), (-3658), (-3658), 1, 29);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
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
  public void test_0571()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726621670297723000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86405171,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=3,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 1000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 2025);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2025 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 3);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 1969, (-1964), 1969, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 3);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 60000, 60000, 2, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726621670297723000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86405171,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=3,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 97 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 6, 60000);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 2, 5);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=113542865510400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3600000,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=65,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 5, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726458498972800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86400000,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=156,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 99);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-4186));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      MockDate mockDate0 = new MockDate(60000, 3, 3600000, 4341, 3, 211);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4305), 9, 0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=4306,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=273,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 5, 86400000);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      assertEquals("Sun Jul 01 00:00:00 GMT 236559", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3658), (-3658), (-3658), 1, 29);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-187545715200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3974,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1000, 2, 1, 11);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 117 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 1000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-984));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9, 9, 9, 9, 9);
      Date date0 = DateUtils.truncate((Date) mockDate0, 9);
      assertEquals("Sat Oct 09 09:00:00 GMT 1909", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
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
  public void test_0598()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-1541));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 3045);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
      Date date0 = DateUtils.round((Object) mockDate0, 13);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "a`";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("a`", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate(" is not valid.", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date:  is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("4==5p-", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
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
  public void test_0606()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1001, 3600000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 45, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1000, 1001);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      Instant instant0 = MockInstant.now(clock0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.ofInstant(instant0, (ZoneId) zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-1376), (-1928), 21, (-823), (-1051));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-823), (-2770), (-1051));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
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
  public void test_0610()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1001, 3600000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
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
  public void test_0612()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3658), (-3658), (-3658), 1, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1149), 4, 991, 4, (-2825), (-2392));
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
  public void test_0614()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
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
  public void test_0616()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 5, 60000);
      Date date0 = DateUtils.add(mockDate0, 6, (-1507));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Fri Jul 23 00:00:00 GMT 2066", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1L));
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
  public void test_0619()  throws Throwable  {
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
  public void test_0620()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 2573);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Mon Jun 02 01:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 326);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 6, 60000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-152), (-528), 3, (-16), (-528), 757);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
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
  public void test_0624()  throws Throwable  {
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
  public void test_0625()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1333, 1333, 1333, 12, 280000000);
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
  public void test_0627()  throws Throwable  {
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
  public void test_0628()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2109, 2109, 2109);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=10114588800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2290,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=190,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
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
  public void test_0630()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1001, 3600000);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
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
  public void test_0632()  throws Throwable  {
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
  public void test_0633()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1);
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
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 4140);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1000, 1001);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addWeeks(date0, 3431);
      assertEquals("Fri Jul 17 00:00:00 GMT 1648", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-1447));
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
      DateUtils dateUtils0 = new DateUtils();
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE);
      Calendar calendar1 = DateUtils.truncate(calendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }
@Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setWeekDate(280000000, 3, 4);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 60000, 1000, 233, 1000, 86400000);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=127382198400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6006,MONTH=7,WEEK_OF_YEAR=31,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=213,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 60000, 1000, 233, 1036, 86400000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2, 86400000, 280000000, 3, (-820), 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(12, (-1), (-1), (-1), 12);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 396, 184);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 6);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Fri Feb 14 20:21:27 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(86400000, 60000, 5);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-856), (-856), 0);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 1001);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 1001);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3287));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-3287,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 1001, 2, 2, 1916);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4, 3, 1000);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), (-1), (-1), 5, 5);
      Date date0 = DateUtils.addHours(mockDate0, 5);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Tue Nov 29 04:05:05 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 1144);
      assertEquals("Sat Feb 15 15:25:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 2);
      assertEquals("Sun Feb 16 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-298), (-298), 0, 222, 13);
      Date date0 = DateUtils.add(mockDate0, 1, 13);
      assertEquals("Sat Mar 09 06:13:00 GMT 1577", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2629), (-2526), (-2629), (-715));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-1653));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 5005, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 5005);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(33, 33, 33, 33, 1444, 12);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1444);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1000, 2136, (-1640), 1, 1444);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-2163));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000010, 280000000, 280000000, 280000010, 280000010);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-1677));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "YVak7+\":R.8q";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("YVak7+\":R.8q", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'V'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
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
  public void test_0665()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 86400000, 1, 1001, 6);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 86400000, 3600000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-1852), (-1852), 8, (-1852), 0);
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
  public void test_0668()  throws Throwable  {
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
  public void test_0669()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 2200);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 693);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 693 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, (-1252));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1252 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 2793, 2793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE, locale0);
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
  public void test_0679()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, (Calendar) null);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
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
  public void test_0681()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 1906);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1906 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 1001, 6, 86400000, 3600000, 1001);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=251784548201000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9948,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=270,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=16,SECOND=41,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 6, 2);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 0, 3600000, 3600000, 2, 6);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=261927216126000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10270,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=2,SECOND=6,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 41);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1809, 1809, 9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sun Oct 09 00:00:00 GMT 3859", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      MockDate mockDate0 = new MockDate(4, 3, 1000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sat Dec 01 00:00:00 GMT 1906", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 3600000, 60000, 1001, 4, 86400000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 16 00:00:00 GMT 302073", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
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
  public void test_0695()  throws Throwable  {
      MockDate mockDate0 = new MockDate(700, 700, 700);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 700);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 700 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 280000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-38));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 927);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0700()  throws Throwable  {
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
  public void test_0701()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-1771));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1771 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-4763));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-102));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(",eEtr* C~-CZQ$GAcG~", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "z]";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("z]", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "D";
      try { 
        DateUtils.parseDate("D", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: D
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("VC^(+rG@", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
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
  public void test_0712()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 2);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 1061, 449);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 5, 4, 6, 60000);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61992691200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 5, 3, 6, 1906);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 59, 280000000, 659, (-3410), 280000000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=24130307376000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=766629,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
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
  public void test_0718()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 5, 4, 6, 60000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
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
  public void test_0720()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 0, 320);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(Integer.MAX_VALUE, 1206, Integer.MAX_VALUE, Integer.MAX_VALUE, 1206, Integer.MAX_VALUE);
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
  public void test_0722()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
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
  public void test_0724()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 1001, 2, 2, 1916);
      MockDate mockDate1 = new MockDate(1001);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      String[] stringArray0 = new String[3];
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
  public void test_0726()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 1001, 2, 2, 1916);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
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
  public void test_0728()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 3);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62064921600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=91,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(12, (-1), (-1), (-1), 12);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-899), (-899), (-899), (-899), 280000000);
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) zoneInfo0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) zoneInfo0);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
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
  public void test_0733()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 60000, 8, 5, 5);
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
  public void test_0734()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), (-1), (-1), 5, 5);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
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
  public void test_0736()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 6, 2);
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
  public void test_0737()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
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
  public void test_0739()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-472));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 60000, 8, 5, 5);
      Date date0 = DateUtils.addMonths(mockDate0, 3121);
      assertEquals("Thu Jan 08 05:05:00 GMT 6905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1623);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      MockDate mockDate0 = new MockDate(86400000, 2, 2, 3, 5, 5);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 8);
      assertEquals("Fri Mar 02 03:05:05 GMT 86401900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, (-2629), (-2526), (-2629), (-715));
      Date date0 = DateUtils.addYears(mockDate0, (-193));
      assertEquals("Mon Sep 11 23:05:00 GMT 280001673", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, (-2799));
      assertEquals("Fri Jun 24 20:21:21 GMT 1960", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE, locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }
@Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(279999971, 349, 23, 23, 349);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 23 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(26, 26, 26, 26, 26);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1084), 1001, 26, 4, (-6533));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(146134526, 49, 146134526, 1969, (-2966));
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("es`TS~%");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      MockDate mockDate0 = new MockDate(31, 31, 31);
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-3515));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Wed Aug 30 23:59:56 GMT 1933", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(146134525, 146134525, 22, 1429, 2391);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(26, 26, 26, 26, 26);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, (-1), (-1), 2014, (-2809));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1217));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1217,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 16, 280000000, 320, 1264);
      mockGregorianCalendar0.set(1264, 280000000, 16, 0, 1264);
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=736321723056000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=23335076,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=198,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-1217));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1217,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 7, 7);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 225);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      Date date0 = DateUtils.addWeeks(mockDate0, 0);
      assertEquals("Sun Dec 31 00:00:00 GMT 1899", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 1);
      assertEquals("Fri Feb 14 20:21:22 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 8);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 1822, (-2146512374));
      Date date0 = DateUtils.addMinutes(mockDate0, 0);
      assertEquals("Wed Mar 29 00:00:00 GMT 5874774", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 1);
      assertEquals("Fri Feb 14 21:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      MockDate mockDate0 = new MockDate(116, 0, 116, 0, 116, (-185));
      Date date0 = DateUtils.add(mockDate0, (-1742), 0);
      assertEquals("Mon Apr 25 01:52:55 GMT 2016", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.set(1, (-1524), 0);
      calendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate(calendar0, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(279999971, 322, 2013, (-21), 322);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 322);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
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
  public void test_0773()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-2598), (-2598), 1, (-2598));
      mockGregorianCalendar0.roll(1, (-2598));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-2598));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(279999962, 2867, 2013, (-19), 328);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "E6f;AJYtJ-q6<i";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("E6f;AJYtJ-q6<i", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 1674, 2, (-1774), 1674);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-675));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.roll(1, (-2652));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1059), (-1059), (-1059));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
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
  public void test_0781()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-2598), (-2598), 1, (-2598));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3638);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 3638 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-2943), (-2943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
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
  public void test_0785()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(40, 40, 40, 40, 40, 40);
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
  public void test_0787()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      assertFalse(calendar0.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-2178));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -2178 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 5);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1021);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 21, 4);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 682);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 2003);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1429, 1, 1429, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=120,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=91,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=1,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, 9, 9, 9);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61858944000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=283,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, (-1358));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@4744dff0
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-1959));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1959 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-993));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 2);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 44);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-2799));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 26 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2324), (-2324), (-2324), (-2324), (-2324), (-2324));
      Date date0 = DateUtils.round((Object) mockDate0, 0);
      assertEquals("Sun Jan 01 00:00:00 GMT 626", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-604));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      MockDate mockDate0 = new MockDate(281182495, 26, 3, 281182495, 3);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 26);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      String[] stringArray0 = new String[20];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("BzV^5g?M )`Z", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      String[] stringArray0 = new String[20];
      stringArray0[0] = "H";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("H", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
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
  public void test_0819()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("G)Px", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: G)Px
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      String[] stringArray0 = new String[4];
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
  public void test_0821()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours((-1));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1429, 1, 1429, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, 1429, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855187200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
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
  public void test_0828()  throws Throwable  {
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
  public void test_0829()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-23), (-23), (-23), (-23), 9, (-23));
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
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
  public void test_0831()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
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
  public void test_0833()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 7, 7);
      MockDate mockDate1 = new MockDate((-1407), (-1407), (-1407));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
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
  public void test_0835()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 7, 7);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
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
  public void test_0837()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2031, 2031, 2031, 2031, 2031, 2031);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2223), (-2223), 1941);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
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
  public void test_0841()  throws Throwable  {
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
  public void test_0842()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 2955, 2);
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
  public void test_0843()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
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
  public void test_0845()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(40, 40, 40, 40, 40, 40);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-60796595960000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=43,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=3,DAY_OF_MONTH=9,DAY_OF_YEAR=160,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=40,SECOND=40,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Locale locale0 = new Locale("z=D[*^7;S", "~OLbUcJa|xJ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
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
  public void test_0847()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(50, 50, 50, 50, 50);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-60453724200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=54,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=111,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=50,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-40));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 274);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 2134);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 20);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-1498));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 663);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 0, 4);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 3 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.clear();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      MockGregorianCalendar mockGregorianCalendar1 = (MockGregorianCalendar)dateUtils_DateIterator0.next();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=86400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeZone.setDefault((TimeZone) null);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 3600017, (-2245), 3600000, 3600017, 0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1637, 1637, 1637, (-1969), 7, (-2774));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 86400000);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 320, 320, 320, 2654);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(503, 320, 320, 2654, 57, 2654);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar1, mockGregorianCalendar0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1421L));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1178), (-1178), (-1178));
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 1, 3, 4, 1001);
      mockGregorianCalendar0.setFirstDayOfWeek((-365));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-365,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=34,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 1);
      Date date1 = DateUtils.round(date0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date1.toString());
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1048, 0, 1048);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 10);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1050,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=317,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 10, 2, 3600000, 2800, 10);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 10);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-48802093200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=1,YEAR=423,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=3,DAY_OF_MONTH=9,DAY_OF_YEAR=190,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 10, 2, 3600000, 2800, 10);
      mockGregorianCalendar0.setFirstDayOfWeek((-1798));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 10);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-48802093200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1798,minimalDaysInFirstWeek=1,ERA=1,YEAR=423,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=190,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 1, 1000, 3600000, 5);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Date date0 = DateUtils.truncate((Object) calendar0, 9);
      Date date1 = DateUtils.addWeeks(date0, 9);
      assertEquals("Fri Apr 18 20:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(1L);
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addMonths(date0, (-1412));
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 1, 1000, 3600000, 5);
      Date date0 = DateUtils.addDays(mockDate0, 2227);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sun Aug 09 00:05:00 GMT 2325", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1408L));
      Date date0 = DateUtils.add(mockDate0, 1, 1);
      assertEquals("Wed Dec 31 23:59:58 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 1000, 280000000, 1, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1858);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 6, (-62), 1, 22);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, (-305));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 873);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, (-2271), 280000000, (-415));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-2271));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1000, 6, 6, 3600000, 1);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1272));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 146134526, 146134526, 280000000, 9);
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
  public void test_0888()  throws Throwable  {
      String[] stringArray0 = new String[18];
      stringArray0[0] = "Calendar value too large for accurate calculations";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Calendar value too large for accurate calculations", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'C'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 4026);
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
  public void test_0890()  throws Throwable  {
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
  public void test_0891()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 1001, 6, 2, 4, 3);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-956));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
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
  public void test_0895()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Date date0 = DateUtils.truncate((Object) calendar0, 9);
      DateUtils.iterator(date0, 6);
      assertEquals("Fri Feb 14 20:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-1138));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1138 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 6, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      // Undeclared exception!
      try { 
        DateUtils.add(date0, 1001, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1037, 60000, 2, 1001, 3600000, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
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
  public void test_0901()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) calendar0, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 11 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 3);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 485);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 3, 1000, 4, 86400000);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-56826129600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=169,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=93,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 86400000, 1530);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=93600004,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=69,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, (-1817));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 3, 1000, 3600000, 5);
      Date date0 = DateUtils.truncate((Object) mockDate0, 13);
      assertEquals("Tue Sep 02 00:05:00 GMT 2319", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 2791);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-701));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 4149);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 979);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1);
      Date date1 = DateUtils.round((Object) date0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      String[] stringArray0 = new String[12];
      stringArray0[0] = "SZ";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("SZ", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("AndWW_w", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: AndWW_w
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
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
  public void test_0926()  throws Throwable  {
      String[] stringArray0 = new String[22];
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
  public void test_0927()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=7402997980800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=236561,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=244,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 60000, 4, 1000, 60000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=127186243200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6000,MONTH=4,WEEK_OF_YEAR=21,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=137,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2386), (-2386), 579, (-2386), (-2386));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2386), 2573, 579);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 2, 60000, 2, 5);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(60000, 4, 1148, (-2923), 1, (-4788));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
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
  public void test_0933()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3091, (-2644), (-2644), 3091, 1001, 86400000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
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
  public void test_0935()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1001, 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=236641,MONTH=7,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=182,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
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
  public void test_0937()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 1001, 86400000);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
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
  public void test_0939()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 1000, 3600000, 5);
      Date date0 = DateUtils.addHours(mockDate0, 5);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Tue Dec 02 05:05:00 GMT 2319", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      MockDate mockDate0 = new MockDate(952L);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_0942()  throws Throwable  {
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
  public void test_0943()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3091, (-2644), (-2644), 3091, 1001, 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=28290729600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2866,MONTH=6,WEEK_OF_YEAR=27,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=182,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 86400000, 4, 2, 3);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 8, 8, 2800, (-2147483646), 8);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
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
  public void test_0947()  throws Throwable  {
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
  public void test_0948()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 6, 1000, 3600000, 5);
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
  public void test_0949()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
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
  public void test_0951()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1266), 5, (-1266));
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
  public void test_0953()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 1, 3, 4, 1001);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62006613540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=34,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=41,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-809));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 791);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, (-34));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 1767);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 5);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 8, 8, 8, 8, (-1279));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 280000000 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      mockGregorianCalendar1.set((-1241), 4, 1000, (-3502), 29);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      mockGregorianCalendar1.set(0, 0, 0, 0, 9, 9);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1797), (-766), 5, (-1797), 5);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1), (-2720), 2013, 1, 15);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-1435));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Fri Mar 12 20:21:21 GMT 2010", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-104), 38, 2109, 2109, 38, 3754);
      MockDate mockDate1 = new MockDate((-3141), (-1243), (-1243), 305, 3754);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-942), 9, (-1), 11, (-1), (-1));
      Date date0 = DateUtils.truncate((Date) mockDate0, 9);
      assertEquals("Wed Sep 29 10:00:00 GMT 958", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-461));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 12);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-461,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-3064));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-3064,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 11, 20, 8);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 13);
      assertEquals("Tue Jan 11 20:08:00 GMT 1", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      MockDate mockDate0 = new MockDate(14, 14, 14, 14, 14);
      Date date0 = DateUtils.addYears(mockDate0, 0);
      assertEquals("Sun Mar 14 14:14:00 GMT 1915", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 3);
      assertEquals("Fri Mar 07 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, (-2670));
      assertEquals("Fri Feb 14 19:36:51 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 0, 1110);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
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
  public void test_0984()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000025, 280000025, 280000025, 280000025, 280000025, (-1279));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1279));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "TSX>%0^4-C4>";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("TSX>%0^4-C4>", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
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
  public void test_0987()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-23), (-23), (-1364));
      mockGregorianCalendar1.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-1541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-8), (-8), 14, 12, 12, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62439853677000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=10,MONTH=4,WEEK_OF_YEAR=20,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=134,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=12,SECOND=3,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030433356000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 2372);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2372 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      MockDate mockDate0 = new MockDate(767, 767, 767);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 767);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 767 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-2823), (-2823));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-345), 2884, (-2493));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2493), 1430, 1430, 1430, (-345), (-2493));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
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
  public void test_1003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(gregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", gregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 499);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@558f866f
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
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
  public void test_1007()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 307);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 307 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 3, 3, 3, 3, 3);
      mockDate0.setTime(1392508800000L);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 34);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 34 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-1526));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1354));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.clear();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 1001);
      Calendar calendar2 = DateUtils.round(calendar1, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar2.toString());
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1970, 6, (-2177), (-2177), 3, (-2177));
      Date date0 = DateUtils.round((Date) mockDate0, 13);
      assertEquals("Thu Apr 14 06:26:43 GMT 3864", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, (-1764));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-875));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) locale0, 243);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate fr_FR
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 3600000 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 320);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 793);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, 15);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@6e1ef799
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1898);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1898 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
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
  public void test_1028()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 2516);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6);
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
  public void test_1032()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("^rKe3N", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: ^rKe3N
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "F";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("F", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate(",T$mkg8A`uO5", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      String[] stringArray0 = new String[6];
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
  public void test_1037()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1262, 1262, 1262);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(gregorianCalendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, (-1));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(320, 320, (-141), (-141), (-141), 320);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-141), (-141), (-141), 320, 15, 15);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(320, 320, 320, 320, 320);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
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
  public void test_1042()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, (-1));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
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
  public void test_1044()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(116, 116, 116);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1003, (-1077), (-1077));
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
  public void test_1046()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) gregorianCalendar0, (Calendar) gregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
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
  public void test_1048()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-209));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Sat Jul 20 20:21:21 GMT 2013", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_1051()  throws Throwable  {
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
  public void test_1052()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 6);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sat Feb 15 02:21:21 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate((-1080L));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 0, 13);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
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
  public void test_1057()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
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
  public void test_1059()  throws Throwable  {
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
  public void test_1060()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
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
  public void test_1061()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-13));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-1807));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1970, 6, (-2177), (-2177), 3, (-2177));
      Date date0 = DateUtils.addMilliseconds(mockDate0, 11);
      assertEquals("Thu Apr 14 06:26:43 GMT 3864", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 56);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, (-1764));
      Date date0 = DateUtils.addMinutes(mockDate0, (-462));
      assertEquals("Sat Oct 06 01:52:08 GMT 281213048", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(3600000L, DateUtils.MILLIS_PER_HOUR);
  }
}
