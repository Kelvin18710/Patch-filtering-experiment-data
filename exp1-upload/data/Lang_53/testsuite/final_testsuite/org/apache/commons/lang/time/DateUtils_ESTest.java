package org.apache.commons.lang.time;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import java.time.ZoneId;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import sun.util.calendar.ZoneInfo;
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
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1756), (-1756), (-3664));
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(gregorianCalendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(45, 45, 45, 45, 302);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(302, 86400000, 86400000, (-2269), 86400000, 1216);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5, "");
      Locale locale0 = Locale.ITALIAN;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-15), (-23), 1853);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=13,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      MockDate mockDate0 = new MockDate(99L);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-15), 0, (-15), 3969, 0);
      Date date0 = DateUtils.addWeeks(mockDate0, (-15));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sat Feb 14 09:00:00 GMT 1885", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 4, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Instant instant0 = MockInstant.ofEpochSecond((-2183010521693L), (-2183010521693L));
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZonedDateTime zonedDateTime0 = MockInstant.atZone(instant0, zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      MockDate mockDate0 = new MockDate(11, 11, (-747), 2, (-532), 2);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Fri Jan 01 00:00:00 GMT 1909", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Date date0 = DateUtils.round((Object) calendar0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Iterator iterator0 = DateUtils.iterator(date0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 26, 0, 0);
      Date date0 = DateUtils.addYears(mockDate0, 0);
      assertEquals("Mon Jan 01 02:00:00 GMT 1900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, (-996));
      assertEquals("Fri Feb 14 20:04:45 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-937), (-937), 4, (-937), (-937), (-937));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addMonths(date0, (-937));
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000040, 280000040, 280000040, 280000040, 280000040, 280000040);
      Date date0 = DateUtils.addMinutes(mockDate0, 280000040);
      assertEquals("Tue Jun 14 10:01:28 GMT 280413386", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 2520);
      assertEquals("Fri Jan 08 20:21:21 GMT 2021", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 2, 2);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000005, 280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 280000005);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999951, 1000, (-2685));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999916, 1000, 1000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999916);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000005, 280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 280000005);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000005, 280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-1648));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000005);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999938, 1000, (-2695));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 4);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "{g1omwd5ll";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("{g1omwd5ll", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'g'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1000, 2, 60000, 6);
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
  public void test_0027()  throws Throwable  {
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
  public void test_0028()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-1083));
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
  public void test_0029()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 582);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 582 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-1889));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1889 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 1031, 1031);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1205L));
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-1839), 2752);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.round(calendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(mockGregorianCalendar1.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)mockGregorianCalendar1));
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
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
  public void test_0037()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, (-1192));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1192 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 266);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 86400000, 60000, 60000, 5, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=227158078752304000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7200322,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=4,DAY_OF_MONTH=17,DAY_OF_YEAR=351,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 86400000, 3);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 86400000, 60000, 60000, 5, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=227158078752304000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7200322,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=4,DAY_OF_MONTH=17,DAY_OF_YEAR=351,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=5,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 387);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 5, 3600000, 60000, 60000, 1000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Wed Oct 01 00:00:00 GMT 11766", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999952, 1000, 6);
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
  public void test_0051()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 18);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 18 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1756), (-1756), (-3664));
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) zonedDateTime0, 1666);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate 1970-01-01T00:00Z[GMT]
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 3);
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.truncate((Object) date0, 9);
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 1001);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) calendar0, (-1173));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1173 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 838);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-1298));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1298 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 11);
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
        DateUtils.round((Date) null, 266);
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
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("H4-4^%v,;6FK:[+l`f6h", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: H4-4^%v,;6FK:[+l`f6h
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addMilliseconds(date0, (-1323));
      assertEquals("Fri Feb 14 20:21:19 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "#/hLuL-";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("#/hLuL-", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("GMT", (String[]) null);
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
      String[] stringArray0 = new String[5];
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
  public void test_0069()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 60000, 90);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=113700651177600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3605000,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=75,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(7, 1000, 1969, (-2499), 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-53972956800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=259,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=244,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1934), 20, 8, (-191), 996, 60000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(996, (-272), 3, (-1934), (-780));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 86400000, 1000, 3, 1001, 1001);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=227184196003200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7201150,MONTH=7,WEEK_OF_YEAR=31,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=213,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
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
  public void test_0075()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
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
  public void test_0077()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-171), (-171), (-2932), 2348, 1, 3720);
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
  public void test_0079()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
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
  public void test_0081()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
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
  public void test_0083()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 60000, 90);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
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
  public void test_0085()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(86400000L);
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.round(date0, 1);
      boolean boolean0 = DateUtils.isSameDay(date1, date0);
      assertFalse(boolean0);
      assertEquals("Sat Jan 01 00:00:00 GMT 1972", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-15), (-1), (-15));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 86400000, 3);
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
  public void test_0088()  throws Throwable  {
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
  public void test_0089()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
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
  public void test_0091()  throws Throwable  {
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
  public void test_0092()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
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
  public void test_0094()  throws Throwable  {
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
  public void test_0095()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 2460);
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
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-3043));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
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
  public void test_0098()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 2014);
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
  public void test_0100()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1);
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
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 2177);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 1001);
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
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 86400000, 3);
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }
@Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 2, 2, 10, 1898);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 600);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 600 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-201), 9, (-2554));
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 86400000, 4, 2, 1001, 86400000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(60000, 3600000, 10);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(280000007, 0, 280000007, 710, 710);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=61,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 7, 7);
      Date date0 = DateUtils.addMinutes(mockDate0, 1970);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Thu Aug 08 08:50:00 GMT 1907", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(7, 7, 7, 7, 7);
      TimeZone timeZone0 = TimeZone.getTimeZone("X4W$;|4Q[E}");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0, 0);
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2118, 2118, 2118, 0, 2450, 2450);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 4200", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-1573));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1573,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-3965));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-3965,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1001, 0, 1984, 0);
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Sat Jan 01 00:00:00 GMT 1983", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      MockDate mockDate0 = new MockDate(19, (-1), (-1));
      Date date0 = DateUtils.addMilliseconds(mockDate0, 6);
      assertEquals("Fri Nov 29 00:00:00 GMT 1918", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      MockDate mockDate0 = new MockDate(7, 7, 13);
      Date date0 = DateUtils.addHours(mockDate0, 13);
      assertEquals("Tue Aug 13 13:00:00 GMT 1907", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 1517, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000075, 280000075, 280000075);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 280000075);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 1098);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-3286));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 280000005);
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
      MockDate mockDate0 = new MockDate(280000005, 280000005, 280000005, 280000005, 280000005);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 280000005);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-2332));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 86400000, 4, 2, 1001, 86400000);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 188);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(281214909, 3600000, 2, 1001, 6, 3);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 86400000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 1000, 1000, 1000, 1000, 1000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 1392);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "v";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("v", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'v'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000017, 280000017, 280000017, 280000017, 33);
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
  public void test_0134()  throws Throwable  {
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
  public void test_0135()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 60000, 1001, 6, 3);
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
  public void test_0136()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000017, 280000017, 280000017, 280000017, 280000017);
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
  public void test_0137()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1000);
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
  public void test_0138()  throws Throwable  {
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
  public void test_0139()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3910, 3910, 3910, 3910, 3910, 3910);
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
  public void test_0140()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 2353);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-2516));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 22);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1451), (-15), (-5516), 1, 4);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1474, 1, 2, 3145);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Iterator iterator0 = DateUtils.iterator((Calendar) gregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_0147()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-4193));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -4193 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 30, 30);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 29, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4580), (-545), 223, (-4580), 0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
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
  public void test_0152()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      assertFalse(mockGregorianCalendar0.equals((Object)calendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(calendar0.equals((Object)mockGregorianCalendar0));
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
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
  public void test_0154()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1305);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 60000, 86400000);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=7560675216000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=241558,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=96,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 3, 1000, 86400000, 2);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1001 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 6177);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      Date date0 = DateUtils.round((Object) calendar0, 9);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 86400000, 4, 2, 1001, 86400000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7200156,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=216,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 3, 1000, 86400000, 2);
      mockGregorianCalendar0.set(280000000, 3600000, 5, 1137, 1000, 4);
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
  public void test_0167()  throws Throwable  {
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
  public void test_0168()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-426));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 86400000 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 1594);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-762));
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
        DateUtils.round((Calendar) null, 1001);
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
        DateUtils.round((Date) null, 1001);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("%&Ns)", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      String[] stringArray0 = new String[20];
      stringArray0[0] = "D";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("D", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "^E";
      try { 
        DateUtils.parseDate("^E", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: ^E
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
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
  public void test_0181()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  public void test_0182()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27860284800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 3, 1000, 86400000, 2);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=280509782400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10859,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1834), (-1), 44, (-1), 10, (-1));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1001, 44, 3405);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
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
  public void test_0187()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
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
  public void test_0189()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 146139496, 146139496);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1306), (-1306), (-1306), (-1306), (-1306), (-1306));
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
  public void test_0192()  throws Throwable  {
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
  public void test_0193()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000007, 280000007, 280000007, 280000007, 280000007);
      MockDate mockDate1 = new MockDate(280000007, 280000007, 280000007);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
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
  public void test_0195()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000007, 280000007, 280000007, 280000007, 280000007);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
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
  public void test_0197()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 3, 3, 3, 3);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-38), (-38), (-38), (-38), (-754));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 3, 1000, 86400000, 2);
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
  public void test_0200()  throws Throwable  {
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
  public void test_0201()  throws Throwable  {
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
  public void test_0202()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
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
  public void test_0204()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
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
  public void test_0206()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, (-4158), 86400000, (-1), 5);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=7423415334300000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=237208,MONTH=7,WEEK_OF_YEAR=36,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=244,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=5,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 499);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-4137), 86400000, (-1), 1001);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addSeconds(date0, 4);
      assertEquals("Fri Oct 15 00:00:04 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
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
  public void test_0210()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-386));
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
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 219);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, (-3771));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addWeeks(date0, 11);
      assertEquals("Fri May 02 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
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
  public void test_0215()  throws Throwable  {
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
  public void test_0216()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, 0, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1598), (-1598), (-1598), (-1598), 6, (-705));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(24105817, 1, 789);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 6, (-1), 21, 2);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli(864L);
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.round((Object) date0, 1);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(30, 30, 30, 30, 30);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(30, 30, 30);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      MockDate mockDate0 = new MockDate(730, 0, (-5984), (-5984), 7);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2612", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, (-1778), (-555));
      mockGregorianCalendar0.setFirstDayOfWeek((-1778));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 14);
      assertNotSame(mockGregorianCalendar0, calendar0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-854));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-854,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1322), 1, (-1322), (-1322), 5, 5);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1582, 1229, 1582, 0, 4);
      Date date0 = DateUtils.addMonths(mockDate0, 1582);
      assertEquals("Thu Sep 29 00:04:00 GMT 3588", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 6);
      assertEquals("Fri Feb 14 20:27:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3, 3, 3, 3, 3, 3);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 3);
      assertEquals("Fri Apr 03 03:03:03 GMT 1903", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, (-1442));
      assertEquals("Mon Dec 16 18:21:21 GMT 2013", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      MockDate mockDate0 = new MockDate(730, 0, (-5984), (-5984), 7);
      Date date0 = DateUtils.add(mockDate0, 7, 0);
      assertEquals("Sun Dec 06 16:07:00 GMT 2612", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-658), (-658));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 280000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999985, 279999985, 279999985);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999985);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, (-3912), (-3912), (-1));
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
  public void test_0237()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 6);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1001, 280000000, 1001, 20);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-4616));
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
      MockDate mockDate0 = new MockDate(280000000, (-4017), (-4017));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-4017));
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "S_jsW3B}a";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("S_jsW3B}a", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'j'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
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
  public void test_0242()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3959, 3959, 3959, 3959, 3600000);
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
  public void test_0243()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), (-1));
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
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      mockGregorianCalendar0.set(6, (-1929));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-1448));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
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
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 4150);
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
  public void test_0250()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 9 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1997);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1997 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 2019, 2019);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 0, 0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
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
  public void test_0257()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1), 2998, 2998, (-1), (-1), 2998);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 1017);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@330e3f45
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 2088);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2088 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, (-715), 6, 3600000, (-715));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=113553940046700000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3600351,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=5,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1, (-1), 14, (-678), (-4616));
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0268()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 12);
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
        DateUtils.iterator((Date) null, 905);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(45, 9, 9);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=45,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=282,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 1001, 1001, 1001);
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Tue Apr 10 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      DateUtils.truncate((Object) date0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, 2078);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@5701069b
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-588));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -588 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 1509);
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-2420));
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 1152);
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
      MockDate mockDate0 = new MockDate(280000000, 230, 230);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 6);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, 3600000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@406969be
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 2998);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 2998 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 14);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(491, 491, 2, 2, 491);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=531,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 28);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("^Bt'h4Tb", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: ^Bt'h4Tb
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Mz";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Mz", stringArray0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, (-1), 1572);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = new Locale("", "", "-");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, 6, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2198), 535, 1969, (-1454), 535, 3433);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
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
  public void test_0297()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
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
  public void test_0299()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(57, 4590, 4590, 7, 1542);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
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
  public void test_0301()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
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
  public void test_0303()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1332), (-1332), 491, (-1332), 491);
      Date date0 = DateUtils.addSeconds(mockDate0, (-1332));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Tue Mar 11 19:48:48 GMT 458", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1332), (-1332), 491, (-1332), 491);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
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
  public void test_0306()  throws Throwable  {
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
  public void test_0307()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2772, 6, (-21));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockDate mockDate0 = new MockDate((-2947), (-2947), 5, (-1), 41, 20);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
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
  public void test_0311()  throws Throwable  {
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
  public void test_0312()  throws Throwable  {
      MockDate mockDate0 = new MockDate(730, 0, (-5984), (-5984), 7);
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
  public void test_0313()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2947), (-2947), 5, (-1), 41, 20);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
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
  public void test_0315()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
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
  public void test_0317()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(491, 491, 2, 2, 491);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      mockGregorianCalendar0.setLenient(false);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-45381304140000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=531,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=11,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=531,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 16);
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addSeconds(date0, (-1));
      assertEquals("Fri Feb 14 20:21:20 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-4736));
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
      MockDate mockDate0 = new MockDate(3600000, 10, 18, 10, 1, 0);
      Date date0 = DateUtils.addDays(mockDate0, (-854));
      assertEquals("Sun Jul 17 10:01:00 GMT 3601898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
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
  public void test_0323()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(491, 491, 2, 2, 491);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addYears(date0, 2);
      assertTrue(date1.equals((Object)date0));
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3600000, 10, 18, 10, 1, 0);
      Date date0 = DateUtils.addWeeks(mockDate0, 10);
      assertEquals("Sun Jan 27 10:01:00 GMT 3601901", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
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
  public void test_0326()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
  }
@Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1169), 280000000, 9);
      mockGregorianCalendar0.set(280000000, 9, 9, (-1169), 9);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Locale locale0 = Locale.ROOT;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0, locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-15), 13, 2, (-15), 3, 3);
      mockGregorianCalendar1.setTimeInMillis(1392480081320L);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3960, 3960, 3960);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 1571, 3960, (-2934), (-2934), 595);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(26, 26, 26, (-1046), 510);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2268, 1, (-737), (-737));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=189,MONTH=0,WEEK_OF_YEAR=44,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=305,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Date date0 = mockGregorianCalendar0.getTime();
      Date date1 = DateUtils.addDays(date0, (-1));
      boolean boolean0 = DateUtils.isSameDay(date0, date1);
      assertFalse(boolean0);
      assertEquals("Thu Feb 13 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      MockDate mockDate0 = new MockDate(43, (-2147483646), 101, 5, 44);
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, (-503), 86400000, 4, 1001);
      Date date0 = DateUtils.truncate((Date) mockDate0, 1);
      assertEquals("Thu Apr 01 00:00:00 GMT 239413", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3733), (-1), (-1), (-1), (-3733), (-3733));
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 13);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3735,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=330,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=44,SECOND=47,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6838, 111, 111);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2147483646), (-2147483646), (-1175), (-1175), 1001);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, (-1054), 0, (-1054), 2);
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6838, 111, 111);
      Date date0 = DateUtils.addWeeks(mockDate0, 2798);
      assertEquals("Sun Mar 04 00:00:00 GMT 8801", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, (-1));
      assertEquals("Fri Feb 14 20:21:20 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, 2915, 2915, 2915, 1000, 2);
      Date date0 = DateUtils.addMonths(mockDate0, 10);
      assertEquals("Sun Mar 25 03:40:02 GMT 3151", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 13);
      assertEquals("Fri Feb 14 20:34:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 2268);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Feb 14 20:21:23 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 86400000, 86400000, 1, (-1));
      Date date0 = DateUtils.add(mockDate0, 1, (-1323));
      assertEquals("Mon Mar 01 00:59:00 GMT 7438455", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999972, 279999972, 279999972, 279999972, 279999972);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 463);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999969, 279999969, 279999969);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999969);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999972, 279999972, 279999972, 279999972, 279999972);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 21);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999972, 279999972, 279999972, 279999972, 279999972);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 279999972);
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
      mockGregorianCalendar0.setLenient(false);
      mockGregorianCalendar0.set((-4021), (-4021), (-86));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 229);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999972, 279999972, 279999972);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999972);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(16, 16, 16, 16, 16, 16);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280414001, (-1158), 280414001);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-1158));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "'/EZXar";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("'/EZXar", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated quote
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
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
  public void test_0356()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 280000000, 3, 3);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(calendar0, calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3107), (-3107), 0);
      mockGregorianCalendar0.set(0, 18);
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
  public void test_0359()  throws Throwable  {
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
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 3668);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
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
  public void test_0362()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 10, 10, 10, 10);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 10 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-351), (-351));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-2251), (-2251));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1169), 280000000, 9);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
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
  public void test_0367()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) calendar0, (-860));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -860 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 54);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3733), 3, (-3733), 3, (-3733));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-180286945980000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3744,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=6,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=47,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030433360000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2,MONTH=2,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=2,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) iterator0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils$DateIterator@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 20);
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
        DateUtils.iterator((Date) null, 604);
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
      MockDate mockDate0 = new MockDate((-3618), (-3618), (-3618), (-3618), 9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Tue Mar 06 06:00:00 GMT 2031", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      mockDate0.setTime(1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      Object object0 = dateUtils_DateIterator0.next();
      DateUtils.round(object0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859420800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=57,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 3, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 3 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 12);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 27);
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
        DateUtils.truncate((Object) "", (-574));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-376));
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
        DateUtils.truncate((Date) null, (-457));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Object) "z66A@!;", 2319);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round z66A@!;
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 693);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-229));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3733), (-1), (-1), (-1), (-3733), (-3733));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 13);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3735,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=330,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=44,SECOND=47,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 3910);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ",";
      Date date0 = DateUtils.parseDate(",", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      String[] stringArray0 = new String[18];
      stringArray0[0] = "y]a;&!#0H";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("y]a;&!#0H", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("AXQcy+XrS", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("++}GC2bt+u'A-me", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate(");", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: );
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      String[] stringArray0 = new String[11];
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
  public void test_0400()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3960, 3960, 3960);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 1571, 3960, (-2934), (-2934), 595);
      mockGregorianCalendar1.clear();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      mockGregorianCalendar0.clear();
      Locale locale0 = new Locale("Greenwich Mean Time", "Greenwich Mean Time", "Greenwich Mean Time");
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      mockGregorianCalendar1.setTimeInMillis(3600000L);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3733), 14, 3, (-1), 320);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(14, 14, 3);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-1487), (-1487), (-1487), 6, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1276, 1276, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(135, 135, 135, 135, 135, 135);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
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
  public void test_0406()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
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
  public void test_0408()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-2147483646), (-2147483646), (-2147483646), (-2147483646), (-1));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
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
  public void test_0412()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
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
  public void test_0415()  throws Throwable  {
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
  public void test_0416()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1228, 410, 410);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0, 0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
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
  public void test_0420()  throws Throwable  {
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
  public void test_0421()  throws Throwable  {
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
  public void test_0422()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
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
  public void test_0424()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
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
  public void test_0426()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addHours(date0, (-4021));
      assertEquals("Fri Apr 20 11:00:00 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 5);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-489));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 24);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1000L, DateUtils.MILLIS_PER_SECOND);
  }
@Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999934, 673, 1);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-790), (-790), (-790), 0, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-790), (-790), (-790), (-790), 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(41, 41, 41);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(41, 41, 41, 41, 41);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1667, (-1064), (-1), 279999940, 4);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, (-1), 1, (-1064), 3115, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 2986, 86400000, Integer.MAX_VALUE, 60000, 0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(Integer.MAX_VALUE, 3600000, 2986);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, (-559), 1655, 5, 86400000, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, (-1012));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Fri Jan 03 16:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 86400000);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Mon May 25 20:21:21 GMT 2178", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 4, (-3389));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 713, 3760);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1913));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1913,ERA=1,YEAR=70,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=259,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), 0, 0, (-1), (-1), 0);
      Date date0 = DateUtils.truncate((Object) mockDate0, 0);
      assertEquals("Sat Jan 01 00:00:00 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1282, (-933), 21, (-3787));
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, 45, (-431), 45, 999);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      Date date0 = DateUtils.addYears(mockDate0, 929);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.add(mockDate0, 5, 4);
      assertEquals("Tue Feb 18 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-439), 6, 6);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 3690);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-802), 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 280000000);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999940, 742, 1);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-2082));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "J8X]}RKNpOXaPet";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("J8X]}RKNpOXaPet", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'J'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 6, 2, 86400000, 86400000);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HOUR_OF_DAY
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999940, 1000, 1);
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
  public void test_0460()  throws Throwable  {
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
  public void test_0461()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      mockGregorianCalendar0.set(0, 3);
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
  public void test_0462()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-1823));
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
        DateUtils.addSeconds((Date) null, 4);
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
  public void test_0465()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(21, 21, 21);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 21 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 1001);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 3600000, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      MockDate mockDate0 = new MockDate(443, 443, 443, 443, 443);
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 443, 443);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
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
  public void test_0474()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-1), 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61980249600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5,MONTH=11,WEEK_OF_YEAR=50,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=340,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 3600000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-1), 6);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 60000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) stringArray0[0], (-886));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, (-1990));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1990 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1, 1000, 4, 1001);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726458574647260000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86400002,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=300,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=41,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 3, 6);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62032867200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=97,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 36, 36);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2,MONTH=36,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=36,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
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
  public void test_0486()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1930));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, 5, 1001, 3600000, 86400000, 3600000);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sun Mar 24 16:00:00 GMT 3478", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 1, 86400000, 6, 3600000, 60000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sun Feb 03 00:00:00 GMT 238464", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 5, 1000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Mon Feb 01 00:00:00 GMT 1904", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 3);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999940, 742, 1);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-2221));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-381));
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 320);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 2909);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 2909 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 1001);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-1311));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1311 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-22));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999940, 742, 6);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 11, 280000000, 11, 11);
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
  public void test_0505()  throws Throwable  {
      String[] stringArray0 = new String[32];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("3owj*B}yEz?@(y6H", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[0] = "Z";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Z", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("8Q!xKh", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 8Q!xKh
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
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
  public void test_0510()  throws Throwable  {
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
  public void test_0511()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      mockGregorianCalendar1.set(1, (-3875));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-806), (-806), (-806), 0, 0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, (-601), 6, (-601), 0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-63650534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=48,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(578, 578, 578);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4188, 13, (-361), 975, (-442));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1283, 1283, 1283, 1283, 1283, 1283);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 1, 1283);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(5, 86400000, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 1001, 1);
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
  public void test_0518()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(578, 578, 578);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
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
  public void test_0520()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 3, 3, (-1422), (-1643));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=92,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=2,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
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
  public void test_0523()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-1));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Thu Feb 13 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2141, 2141, 2141, 2141, 667);
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
  public void test_0526()  throws Throwable  {
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
  public void test_0527()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.truncate(calendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 4, 1001, 6, 1000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-635), (-650), 28);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
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
  public void test_0531()  throws Throwable  {
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
  public void test_0532()  throws Throwable  {
      MockDate mockDate0 = new MockDate(499, 499, 2313, 1599, 1001);
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
  public void test_0533()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
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
  public void test_0535()  throws Throwable  {
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
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
  public void test_0537()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999940, 725, 6);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=279999940,MONTH=725,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=6,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-439), 6, 6);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addSeconds(date0, (-101));
      assertEquals("Thu Oct 04 23:58:19 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      MockDate mockDate0 = new MockDate(5, (-1933), (-3419), 1000, 1, 21);
      Date date0 = DateUtils.addMonths(mockDate0, 0);
      assertEquals("Tue Aug 31 16:01:21 GMT 1734", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-775));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(578, 578, 578);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addMilliseconds(date0, (-361));
      assertEquals("Thu Oct 04 23:59:59 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-439), 6, 6);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addWeeks(date0, 279);
      assertEquals("Fri Feb 19 00:00:00 GMT 1588", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Locale locale0 = Locale.CANADA_FRENCH;
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE, locale0);
      // Undeclared exception!
      try { 
        DateUtils.isSameInstant(calendar0, (Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000043, (-580), 1320, 1320, (-580));
      mockGregorianCalendar0.add(9, 1320);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-580));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -580 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999995, 6, 3600000, 0, 14);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2443, 1461, 1330);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 60000, 1001, 2, 6, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1435, 1970, (-1728), 4, 4);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      MockDate mockDate0 = new MockDate(86400000, 5, 1000);
      Date date0 = DateUtils.addWeeks(mockDate0, 60000);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Wed Jan 26 00:00:00 GMT 86403053", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-15), (-481), 3814);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Sun Jan 01 00:00:00 GMT 1899", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 437, 0, 437, 550);
      Date date0 = DateUtils.truncate((Object) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 1936", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      MockDate mockDate0 = new MockDate(21, (-15), 21);
      Date date0 = DateUtils.round((Date) mockDate0, 1);
      assertEquals("Wed Jan 01 00:00:00 GMT 1919", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      mockGregorianCalendar0.setFirstDayOfWeek((-770));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-770,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Date date0 = DateUtils.round((Object) calendar0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 780);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-334), (-4328), 5, 2770, 5, 14);
      Date date0 = DateUtils.add(mockDate0, 4, 4);
      assertEquals("Sun Sep 25 10:05:14 GMT 1205", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000033, 280000033, 280000033, 280000033, 1, 279999981);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-1359));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999976, 682, 682, 682, 0);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999976, 6, 3600000, 6, 6);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000036, 280000036, 10, 10, (-706), (-706));
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 280000036);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1866, (-1438), (-1438), 1866, 266, 1866);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-1511));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999995, 6, 3600000, 0, 14);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-43));
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
      String[] stringArray0 = new String[1];
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
  public void test_0569()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "o";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("o", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999976, (-779), 279999976);
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
  public void test_0571()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
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
  public void test_0572()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3652, 3652, 3652);
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
  public void test_0573()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-641), (-641), (-641), (-641), (-641));
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
  public void test_0574()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2986, (-3886), (-3886));
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
  public void test_0575()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-4884));
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
        DateUtils.addWeeks((Date) null, 1823);
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
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, (-906));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 1203);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Iterator iterator0 = DateUtils.iterator(calendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1855);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1855 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000043, 1297, 1);
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
  public void test_0584()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.truncate(calendar0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-1742), (-1742));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 29, 29);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 5);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392422400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 21, 4, 3, 1);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
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
  public void test_0591()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2579, 2579, 2579);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, (Calendar) null);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=26223004800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2800,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=357,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-334), (-4328), 5, 2770, 5, 14);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
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
  public void test_0595()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-271));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -271 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 60000, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 3600000, 3600000);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=9716215680000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=309864,MONTH=7,WEEK_OF_YEAR=34,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=227,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1017), (-1017), (-2250), (-1017), 3, (-2250));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-97134197670000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1110,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=354,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=25,SECOND=30,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 4, 499, 6, 22);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1001,MONTH=4,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=499,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=22,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 279);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 278);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 2, 5, 4, 3600000, 2);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86400007,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=8,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=4,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 60000);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=165,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=189,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000015, 280000015, 280000015);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 280000015);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) dateUtils0, 5);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 6 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 1529);
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-1));
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-858));
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
      MockDate mockDate0 = new MockDate(21, (-15), 21);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 146139496);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 146139496 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 6);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 1908);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 1000);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate(";kV37Mg1d", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: ;kV37Mg1d
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "h";
      stringArray0[1] = "h";
      stringArray0[2] = "h";
      try { 
        DateUtils.parseDate("h", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: h
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("zc", (String[]) null);
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
  public void test_0620()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 60000, 6);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 86400000, 4, 8, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(476, 146139496, 476, 14, 476);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1093), 14, 14);
      mockGregorianCalendar1.set(9, (-1093), 14, 14, 3, 14);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(60000, 60000, 1001, 2, 6, 1);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
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
  public void test_0625()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3652), 248, 3740);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
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
  public void test_0627()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2151), (-1657), 1464, (-1657), 2, (-1657));
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
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
  public void test_0629()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
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
  public void test_0631()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, (-1));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Feb 14 19:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
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
  public void test_0633()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
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
  public void test_0635()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 3600000);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Sat Dec 19 20:21:21 GMT 2020", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3652), 248, 3740);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
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
  public void test_0644()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3652), 248, 3740);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-3652,MONTH=248,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=3740,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 203);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, (-1131), 2227, 1001, 2227);
      Date date0 = DateUtils.addSeconds(mockDate0, 2227);
      assertEquals("Sat Jul 28 12:55:14 GMT 2981", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 3);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Mon Feb 17 20:21:21 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000033, 280000033, 280000033, 280000033, 1, 279999981);
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-2931));
      assertEquals("Mon Feb 17 04:21:26 GMT 280414458", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, (-1131), 2227, 1001, 2227);
      Date date0 = DateUtils.addYears(mockDate0, 2227);
      assertEquals("Sat Jul 28 12:18:07 GMT 2981", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 4);
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
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 1000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 6, 2014, 1559, 1559);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(0, 1559, 2014);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1559, 2014);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(14, 14, 14, 311215, 14);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2489), "");
      Locale locale0 = Locale.ITALY;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate((-3663), 1, 60000, 60000, 60000);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3780), 6, (-4102), (-100), 6);
      MockDate mockDate1 = new MockDate(1, 698, (-3181), (-100), 146139496);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 4005);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Mon Jan 01 00:00:00 GMT 1900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2262, 7, 2262, 14, 14);
      mockGregorianCalendar0.setFirstDayOfWeek((-2302));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 14);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=9428364840000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-2302,minimalDaysInFirstWeek=1,ERA=1,YEAR=2268,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=9,DAY_OF_YEAR=283,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=14,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Object) mockDate0, 10);
      assertEquals("Fri Feb 14 20:21:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-34), (-34), (-34), (-34), (-34), 7);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("The range style ");
      Locale locale0 = Locale.UK;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      calendar0.setFirstDayOfWeek((-87));
      Calendar calendar1 = DateUtils.round(calendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-87,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, (-2058));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3780), 6, (-4102), (-100), 6);
      Date date0 = DateUtils.addSeconds(mockDate0, (-100));
      assertEquals("Sun Apr 02 20:04:20 GMT 1892", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 685);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000);
      Date date0 = DateUtils.addMinutes(mockDate0, 280000000);
      assertEquals("Thu Mar 04 20:14:08 GMT 280445912", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addHours(date0, 13);
      boolean boolean0 = DateUtils.isSameDay(date0, date1);
      assertEquals("Sat Feb 15 09:21:21 GMT 2014", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-94), 0, (-94), 0, 0);
      Date date0 = DateUtils.add(mockDate0, 0, 0);
      assertEquals("Sat Sep 28 00:00:00 GMT 1805", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 280413962);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 0);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 785);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 280000000, 280000000, 2703);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 2703);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 280000000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0676()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-34), (-34), (-34), (-34), (-34), 7);
      mockGregorianCalendar0.set(0, (-34));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 2505);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1079, 959);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 1079);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 48, 4, 4);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, (-207));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-2779));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "26efa-$I~yEU_";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("26efa-$I~yEU_", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'e'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
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
  public void test_0682()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 27, 3, 2513);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MINUTE
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 6, 959);
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
  public void test_0684()  throws Throwable  {
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
  public void test_0685()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, 2120);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, (-1408));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 846);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 60000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1891), (-1891), 29, 29, 6, 1005);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 357, (-1000));
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 2713);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 2713 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
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
  public void test_0694()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 212, 212);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
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
  public void test_0698()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, 3248, 1536, 1155, 1933, 385);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-524));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -524 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 6, 15);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) iterator0, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils$DateIterator@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
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
  public void test_0702()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 2513, 27, 27, 27, 27);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-55461702753000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=212,MONTH=5,WEEK_OF_YEAR=27,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=180,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=27,SECOND=27,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2262, 7, 2262, 14, 14);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -12 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 48, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62026631760000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=5,WEEK_OF_YEAR=25,WEEK_OF_MONTH=3,DAY_OF_MONTH=17,DAY_OF_YEAR=169,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-2590));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 2802, 2802, 0, 3265);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Mar 04 06:00:00 GMT 2141", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9, 1791, 9, 4, 1791);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Thu Apr 11 00:00:00 GMT 2058", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 1, 280000000, 1, 1, 1);
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
  public void test_0716()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, (-2165));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@504aa1f7
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 319);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 319 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 409);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 6);
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        DateUtils.round((Object) locale0, 11);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round ko
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      MockDate mockDate0 = new MockDate(69L);
      Date date0 = DateUtils.round((Object) mockDate0, 0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 2821);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-2867));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-1211));
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
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "]";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("] JcRE", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  public void test_0729()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "H5";
      try { 
        DateUtils.parseDate("H5", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: H5
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("${N]=3(Ji-];'P", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      String[] stringArray0 = new String[6];
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
  public void test_0732()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(15, 385, 3131);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(385, 15, (-172));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 13, 4, 4);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4, 13, 4);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeInMillis((-62167478400000L));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(6, 3248, 1536, 1155, 1933, 385);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 1, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
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
  public void test_0737()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
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
  public void test_0739()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 3, 3, (-23), 3);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
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
  public void test_0741()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
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
  public void test_0743()  throws Throwable  {
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
  public void test_0744()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
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
  public void test_0746()  throws Throwable  {
      Locale locale0 = new Locale("lNhRfVAe7hp^y'(", "lNhRfVAe7hp^y'(", "!$';?i");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(3057L);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-3091), (-3091));
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
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
  public void test_0750()  throws Throwable  {
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
  public void test_0751()  throws Throwable  {
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
  public void test_0752()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
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
  public void test_0754()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 4, 4);
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
  public void test_0755()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-405));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-1));
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Thu Feb 13 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 6);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, (-1544));
      assertEquals("Fri Jul 13 20:21:21 GMT 1984", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-1207));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1000, DateUtils.MILLIS_IN_SECOND);
  }
@Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 60000, 25);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 729, 729, 729, 28);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-60027004800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=67,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=302,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(12, 12, 1014, 1, 15, 12);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 12);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61669550700000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=15,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=15,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(9, 6, 0, 9, 6, 6);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 0);
      MockDate mockDate0 = new MockDate(0, (-9), 0);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 0);
      MockDate mockDate0 = new MockDate(0, (-603), 0);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1034), (-1034), (-1034), 10, 1806);
      MockDate mockDate1 = new MockDate((-5913), (-1034), (-1034), 45, (-1), 11);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-2434));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-2434,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      calendar0.setFirstDayOfWeek((-2661));
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-2661,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392422400000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999986, 279999986, 4, 4, 279999986);
      mockGregorianCalendar0.set(279999986, 4, 3830, 3830, 3830, 4);
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=279999997,MONTH=0,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=91,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Iterator iterator0 = DateUtils.iterator(date0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      MockDate mockDate0 = new MockDate(944L);
      Date date0 = DateUtils.addYears(mockDate0, (-1209));
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, (-312));
      assertEquals("Fri Feb 22 20:21:21 GMT 2008", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1034), (-1034), (-1034), 10, 1806);
      Date date0 = DateUtils.addMonths(mockDate0, 10);
      assertEquals("Wed Jan 01 16:06:00 GMT 777", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 1001);
      assertEquals("Fri Feb 14 20:21:22 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 13);
      assertEquals("Sat Feb 15 09:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1034), (-1034), (-1034), 10, 1806);
      Date date0 = DateUtils.add(mockDate0, 5, 1806);
      assertEquals("Wed Dec 12 16:06:00 GMT 781", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999986, 279999986, (-1095));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-1095));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 5, 2146, 86400000, 2);
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
  public void test_0788()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999958, 279999958, 279999958, 279999958, 1, 279999958);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999958);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999958, 279999958, 279999958, 279999958, 1, 279999958);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999986, 279999986, 279999986);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 279999986);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1915), 2638, (-1915), 2638, 242);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1915));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-1112), (-1112), 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1112));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "The range style ";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("The range style ", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-650), 13, 9, 13, 13, (-650));
      mockGregorianCalendar0.set(0, (-650));
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 5, 9, 280000000, 280000000);
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
  public void test_0796()  throws Throwable  {
      MockDate mockDate0 = new MockDate(6, 86400000, 1000);
      mockDate0.setTime(8835944353689600000L);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 3);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999986, 279999986, 4, 4, 279999986);
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
  public void test_0798()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1899, 86400000, (-1), 13, 45, 1);
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
  public void test_0799()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.isSameDay(calendar0, calendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, (-15), 11, 11, (-15));
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
  public void test_0801()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 772);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999958, 4, 4, 4, 1, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835883078046464000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=279999958,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=124,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=1,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator(calendar0, 86400000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 86400000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2231), 355, 3, 1869, 3, (-2231));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-131631968051000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2203,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=292,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=25,SECOND=49,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.truncate((Date) mockDate0, 2);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
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
  public void test_0809()  throws Throwable  {
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
  public void test_0810()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
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
  public void test_0812()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1744, 1744, (-830), 13, 3534, 2336);
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-2617226824000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1887,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=24,DAY_OF_YEAR=24,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=32,SECOND=56,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) calendar0, (-3680));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -3680 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) dateUtils0, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
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
  public void test_0816()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1098, 11, 11, 11, 11);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 11 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1000, 1001, 1000, 1001, 1001);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 5, 6, 3600000, 1001);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, 1, 1, 2, 60000, 1);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 3);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1000, 1001, 1000, 1001, 1001);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=86400000,MONTH=1000,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1001,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1000,HOUR_OF_DAY=1000,MINUTE=1001,SECOND=1001,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 1617);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 41);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 60000, 1, 86400000, 1000);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Jun 20 00:00:00 GMT 16757", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
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
  public void test_0829()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-540));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, (-392));
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-1161));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      MockDate mockDate0 = new MockDate(8, 8, 8);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 8 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 60000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999986, 279999986, 4, 4, 279999986);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 279999986);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
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
  public void test_0836()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 8 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
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
  public void test_0838()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 279999952);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("org.apache.commons.lang.time.DateUtils$DateIterator", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "a.";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("a.", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
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
  public void test_0843()  throws Throwable  {
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
  public void test_0844()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  public void test_0845()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 146139496, 0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=384255542736000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=12178543,MONTH=5,WEEK_OF_YEAR=22,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=152,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, (-1138), (-1138), 280000000, 280000000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1138), (-1138), 280000000, 280000000, (-1138));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 5444, (-1), 2332, 1, 279999958);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1710, 1710, 1710, 1710, 1710, 1710);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
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
  public void test_0850()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 146139496, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
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
  public void test_0852()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000029, (-1112), (-1112), 280000029, 280000029);
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
  public void test_0853()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
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
  public void test_0855()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000);
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
  public void test_0857()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 0);
      MockDate mockDate0 = new MockDate(410, 0, 410);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
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
  public void test_0859()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1, 4013);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61694006400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=15,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 5444, (-1), 2332, 1, 279999958);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-1803), 403, 1000, (-2717), 19);
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) zoneInfo0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
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
  public void test_0863()  throws Throwable  {
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
  public void test_0864()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      MockDate mockDate0 = new MockDate(113615795201225000L);
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
  public void test_0866()  throws Throwable  {
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
  public void test_0867()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(962, 962, 0);
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
  public void test_0869()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999986, 279999986, 4, 4, 279999986);
      mockGregorianCalendar0.set(279999986, 4, 3830, 3830, 3830, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835884306229004000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=279999997,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=94,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=50,SECOND=4,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 408);
      assertEquals("Fri Feb 14 20:28:09 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, (-2265));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addDays(date0, 20);
      assertEquals("Thu Mar 06 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, (-174));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1);
      Date date0 = DateUtils.addMinutes(mockDate0, 4);
      assertEquals("Thu Jan 01 00:04:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      Locale locale0 = Locale.ROOT;
      Calendar calendar0 = MockCalendar.getInstance(dateUtils0.UTC_TIME_ZONE, locale0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 5);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar1);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }
}
