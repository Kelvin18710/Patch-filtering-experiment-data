package org.apache.commons.lang.time;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 282, 13, 13, 282);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999977);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 279999977 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(13, 229, 2954, 2954, 8);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(8, (-3237), 8, 13, 2);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-5181), "z");
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-5181), (-5181), (-5181));
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(182, 182, 182, 182, 4429);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      MockDate mockDate0 = new MockDate(35, 35, 6, 6, 6);
      Date date0 = DateUtils.addWeeks(mockDate0, 35);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Mon Aug 08 06:06:00 GMT 1938", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-5973), 2081, 3573, 2081, 2, 3);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-258), 13, 0, 150, 13, 13);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1643", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-4289));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-4289,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      mockGregorianCalendar0.setFirstDayOfWeek((-4696));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855187200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-4696,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1847), (-1847), 0, 0, 0, (-1847));
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1479), (-1221), (-1479), 3493, 3493);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2081, 1921, (-5973), 0, (-1));
      Date date0 = DateUtils.addYears(mockDate0, 5);
      assertEquals("Sat Sep 23 23:59:00 GMT 4124", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, (-2639));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 1102);
      assertEquals("Fri Feb 14 20:21:22 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 1);
      Date date1 = DateUtils.add(date0, 1, 1001);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999977, (-844), 1561, (-844), 1561, (-844));
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-844));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 309, 279999977, 279999977, 309);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-3443));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 333);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 279999977, 13, 13, 279999977);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 279999977);
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
      MockDate mockDate0 = new MockDate(279999957, 279999957, 279999957);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-361));
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
      MockDate mockDate0 = new MockDate(279999977, 279999977, 279999977);
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 279999977);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 297, 13, 13, 297);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999977);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 279999977, 279999977, 279999977, 279999977);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999977);
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
      String[] stringArray0 = new String[1];
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
  public void test_0025()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
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
  public void test_0026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 333);
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
  public void test_0027()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 279999977, 279999977, 279999977, 279999977, 279999977);
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
  public void test_0028()  throws Throwable  {
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
  public void test_0029()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(26, 26, 26, 26, 26, 26);
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
  public void test_0030()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2), (-2), (-2), 6, 6, 6);
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
  public void test_0031()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-117), 6, 6, 598, 6, 1);
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
  public void test_0032()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addSeconds((Date) null, 2636);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
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
  public void test_0034()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1693);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1693 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      MockDate mockDate0 = new MockDate(18, 18, 18);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) mockDate0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 0 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-2617));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -2617 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 4119, 4119);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 397, 397);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2, 2, 1921, 1921, 2, 1921);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
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
  public void test_0044()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) "", 15);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 3297);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 3297 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 2);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(7, 7, 7, 7, 7);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61927606380000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=219,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=7,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2), (-2), (-2), 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 5, 5, 5, 5, 5);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-5466), (-5466), (-5466));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-249508166400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=5938,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=194,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 3);
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
        DateUtils.iterator((Date) null, 5);
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
      MockDate mockDate0 = new MockDate(1571, 1571, 1571);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Mon Mar 20 00:00:00 GMT 3606", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, 9, 9, 9, 9);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61858944000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=283,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.roll(5, 5);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=50,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999977, 279999977, 13, 13, 279999977);
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
  public void test_0063()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, 3);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@45128030
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 3011);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 231);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, (-1504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1946);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 1946 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@2426b0
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
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
  public void test_0070()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-1576));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-868));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "M ";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("M ", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("3C(^OuysK0}N/6\"tdP", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 3C(^OuysK0}N/6\"tdP
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
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
  public void test_0076()  throws Throwable  {
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
  public void test_0077()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.ofInstant(localDateTime0, zoneOffset0, (ZoneId) zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(309, (-1302), 1, (-1302), 21);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-55855872000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=200,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1, 1, 1, 696, 696, (-2035));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
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
  public void test_0082()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
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
  public void test_0084()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 12);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
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
  public void test_0086()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
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
  public void test_0088()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 8);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Apr 11 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  public void test_0091()  throws Throwable  {
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
  public void test_0092()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 6);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Sat Feb 15 02:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, 6699);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Fri Jun 18 20:21:21 GMT 2032", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(26, 26, 26, 26, 26, 26);
      mockGregorianCalendar0.set((-792), 4045, (-1), 26, (-792));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(27, 145, 145);
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
  public void test_0096()  throws Throwable  {
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
  public void test_0097()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-15), (-15), (-15), (-15), (-15));
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
  public void test_0099()  throws Throwable  {
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
  public void test_0100()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
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
  public void test_0102()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, (-1646));
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
      MockDate mockDate0 = new MockDate((-5181), (-5181), (-5181));
      Date date0 = DateUtils.addSeconds(mockDate0, (-5181));
      assertEquals("Sun Jan 21 22:33:39 GMT 3728", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
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
  public void test_0105()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 1369);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 26);
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
  public void test_0108()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-868), (-868), (-868));
      Date date0 = DateUtils.addMinutes(mockDate0, (-868));
      assertEquals("Tue Apr 14 09:32:00 GMT 957", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(86400000, DateUtils.MILLIS_IN_DAY);
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 2, 2);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=62,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1089), 499, 2014, 3);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) gregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 12);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 14);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertEquals("Fri May 23 20:21:21 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addWeeks(mockDate0, 280);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Thu May 15 00:00:00 GMT 1975", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1862L);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      Date date0 = DateUtils.add(mockDate0, 9, 2013);
      assertEquals("Fri Mar 26 10:00:00 GMT 723", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000);
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
  public void test_0119()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5380, 5380, 5380, 5380, 5380, 5380);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 5380);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5380, 5380, 5380, 5380, 5380, 5380);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 5380);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999987, 5384, 5384, 5384, 5384, 279999987);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 279999987);
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
  public void test_0123()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999987, 279999987, 2929, 279999987, 7, 1);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 7);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000010, 5384, 5384, 5384, 5384, 280000010);
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
  public void test_0125()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "fX7}4)nF9x:9NZ_";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("fX7}4)nF9x:9NZ_", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 5);
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
  public void test_0127()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator(calendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, (-20), (-20), (-20), (-20), (-20));
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
  public void test_0129()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 21, 21);
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
  public void test_0130()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4037, 4128, 2967, 4128, 1001, 3769);
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
  public void test_0131()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(14, 1001, (-74), 6, 6);
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
  public void test_0132()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 14);
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
        DateUtils.addSeconds((Date) null, 1);
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
        DateUtils.addMonths((Date) null, 5);
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
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, 279999951);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 279999951);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-248));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5384, 5384, 5384, 5384, 5384, 5384);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 5384);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 5384 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 2276, 2276);
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
      MockDate mockDate0 = new MockDate(1388534400000L);
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-2186), (-2186));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar1, calendar0);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135856000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=366,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
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
  public void test_0145()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, (Calendar) null);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61961910840000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=187,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=6,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, (-1534));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@7dd6b6ba
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001, 1001, 1001, 1001);
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
  public void test_0148()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1948);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 3, 8, 8, 8);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61906434720000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=8,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=99,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=8,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1, 1);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62133087539000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=1,SECOND=1,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1089), 499, 2014, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=-1089,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=499,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2014,HOUR_OF_DAY=2014,MINUTE=3,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 2964);
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
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1051));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      MockDate mockDate0 = new MockDate(9);
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1L);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 6, 280000000, 146139496, 1001, 29);
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
  public void test_0162()  throws Throwable  {
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
  public void test_0163()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3484, 3484, 1001);
      Date date0 = DateUtils.truncate((Object) mockDate0, 1001);
      assertEquals("Mon Jan 25 00:00:00 GMT 5677", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
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
  public void test_0165()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      Date date0 = DateUtils.truncate((Object) gregorianCalendar0, 1);
      DateUtils.iterator((Object) date0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 146134526);
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
        DateUtils.truncate((Date) null, (-2554));
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
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      Date date0 = DateUtils.truncate((Date) mockDate0, 9);
      assertEquals("Sat Jun 22 22:00:00 GMT 720", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-2709));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -2709 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
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
  public void test_0171()  throws Throwable  {
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
  public void test_0172()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 279999980);
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("C~?*0CAg/UW/!wZXS|", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: C~?*0CAg/UW/!wZXS|
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String[] stringArray0 = new String[5];
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
  public void test_0176()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("<LX", (String[]) null);
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
      // Undeclared exception!
      try { 
        DateUtils.parseDate((String) null, (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-530), 0, 0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1201, 980, 980, 980, 1201);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1201, 1201, 980, 1201, 1201);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 86400000, 1001, 2014);
      ZonedDateTime zonedDateTime0 = mockGregorianCalendar0.toZonedDateTime();
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(gregorianCalendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-20), (-20), (-20));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2014, 2014, 86400000, 2014, 2014, 3601);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Locale locale0 = new Locale("9^ ^^o");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1089), 499, 2014, 3);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-64980964800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=91,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=308,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
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
  public void test_0188()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1089), 499, 2014, 3);
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
      MockDate mockDate0 = new MockDate(3481, 11, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertEquals("Sun Aug 01 00:00:00 GMT 5384", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3483, 3483, 1001, 11, 3483);
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
      MockDate mockDate0 = new MockDate(238L);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
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
  public void test_0194()  throws Throwable  {
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      Calendar calendar1 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay(calendar0, calendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 0);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3717, 3, 3717, (-834), (-2136));
      MockDate mockDate1 = new MockDate((-2793), (-742), (-2136));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
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
  public void test_0198()  throws Throwable  {
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
  public void test_0199()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1931), (-1931), (-1194), 15, 451);
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
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
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
  public void test_0202()  throws Throwable  {
      Locale locale0 = Locale.US;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
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
  public void test_0204()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      Date date0 = DateUtils.addHours(mockDate0, 499);
      assertEquals("Sat Jul 13 17:00:00 GMT 720", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3481, 11, 1001);
      Date date0 = DateUtils.addSeconds(mockDate0, (-1));
      assertEquals("Thu Aug 26 23:59:59 GMT 5384", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      Date date0 = DateUtils.addMonths(mockDate0, 9);
      assertEquals("Sat Jun 22 22:00:00 GMT 720", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 6, 280000000, 146139496, 1001, 29);
      Date date0 = DateUtils.addDays(mockDate0, (-3417));
      assertEquals("Fri Aug 13 08:41:29 GMT 280785176", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1089), (-1089), 0, 2014, 0);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 499);
      assertEquals("Sat Jun 22 22:00:00 GMT 720", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      MockDate mockDate0 = new MockDate(238L);
      Date date0 = DateUtils.addYears(mockDate0, 0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 1095);
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
      MockDate mockDate0 = new MockDate(3481, 11, 1001);
      Date date0 = DateUtils.addMinutes(mockDate0, (-2854));
      assertEquals("Wed Aug 25 00:26:00 GMT 5384", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
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
}
