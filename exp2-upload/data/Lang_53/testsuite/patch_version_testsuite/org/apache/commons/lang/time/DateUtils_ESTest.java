package org.apache.commons.lang.time;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
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
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;
import java.time.Clock;
import java.time.Instant;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1124), 21, 1766);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1270), 29, 1013, 6, 1752);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1353, 1353, 11, 11, (-734), (-30));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 11);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-15910999200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1465,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=283,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3431), (-241), 838, 2664, (-241));
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2484), 2014, 1, (-2147483646), (-2484), (-2484));
      Locale locale0 = Locale.JAPANESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = (MockGregorianCalendar)MockCalendar.getInstance();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      MockDate mockDate0 = new MockDate(14);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1551), "aZ<*h8Cp!MVs8");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1721, (-1551), (-1551), 1721, 1721);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1241), 3207, 3207);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1433, 68, 1433, 0, 0, 68);
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      assertEquals("Mon Jan 01 00:00:00 GMT 3342", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(57, 6, (-636), 1, 2, 1);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-636));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-636,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3754, 0, 516, 0, 3754, (-2484));
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, (-3448), (-3448), 0, 1509, 1509);
      Date date0 = DateUtils.addDays(mockDate0, (-1));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Fri Mar 23 01:34:09 GMT 2604", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 0);
      Date date1 = DateUtils.addYears(date0, 7);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1124), (-1124), (-1124), (-1124), 276);
      Date date0 = DateUtils.addWeeks(mockDate0, 1534);
      assertEquals("Mon Jul 09 08:36:00 GMT 708", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 604);
      assertEquals("Fri Feb 14 20:31:25 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 1338, 2, 0);
      Date date0 = DateUtils.addMinutes(mockDate0, (-3134));
      assertEquals("Fri Aug 28 21:46:00 GMT 1903", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1433, 68, 1433, 0, 0, 68);
      Date date0 = DateUtils.add(mockDate0, 0, (-63));
      assertEquals("Fri Aug 03 00:01:08 GMT 3342", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000);
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
  public void test_0019()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000013, (-45), (-45), 280000013, (-45), (-45));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 0);
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
      mockGregorianCalendar0.setLenient(false);
      mockGregorianCalendar0.set((-1744), (-1744), (-1744));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1001);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0023()  throws Throwable  {
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
  public void test_0024()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 57, 3);
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
  public void test_0025()  throws Throwable  {
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
  public void test_0026()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 3860);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999982, (-45), (-45), 279999982, 279999982);
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
  public void test_0030()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, (-1907));
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
  public void test_0031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 4574);
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
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-1028));
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
  public void test_0034()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, 45);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 45 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, (-2540), (-2540));
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, (-3016), (-3016));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(532, (-1), 1, 0, (-1), (-1));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
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
  public void test_0041()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      assertFalse(calendar0.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@2ed49e6b
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
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
  public void test_0044()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 238);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030374718680,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 3880);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 3880 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 2342);
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
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-4220));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 3, 2736);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 2);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      MockDate mockDate0 = new MockDate(104140339876000L);
      Date date0 = DateUtils.truncate((Date) mockDate0, 9);
      assertEquals("Tue Jan 28 00:00:00 GMT 5270", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      MockDate mockDate0 = new MockDate(17, 17, 17);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Mon Jun 17 00:00:00 GMT 1918", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 1001);
      assertEquals("Sun Feb 16 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(280000000, 11, 11);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000001,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, 280000000, 632, 632);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 632);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, 280000000);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@3c0afad5
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 1);
      assertEquals("Sat Feb 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-4352));
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 162);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 9);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-2792));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -2792 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@4c0e7e1b
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, 1);
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
        DateUtils.round((Calendar) null, 245);
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
        DateUtils.round((Date) null, 1244);
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
      MockDate mockDate0 = new MockDate(190690528, 190690528, 190690528, 190690528, 190690528, 190690528);
      Date date0 = DateUtils.round((Object) mockDate0, 1001);
      assertEquals("Wed Sep 01 00:00:00 GMT 207127520", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "s";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("s", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        DateUtils.parseDate("#c@ZIs;H", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: #c@ZIs;H
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
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
  public void test_0074()  throws Throwable  {
      String[] stringArray0 = new String[10];
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
  public void test_0075()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(41, 41, 41);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      ZoneInfo zoneInfo0 = (ZoneInfo)DateUtils.UTC_TIME_ZONE;
      Locale locale0 = Locale.US;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0, locale0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, (-3108), (-3501), 6, 7);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-3501), 1, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = MockCalendar.getInstance();
      mockGregorianCalendar0.set((-1226), (-1226), (-1673), 6, 6, 6);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(138, 138, 138);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
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
  public void test_0081()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
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
  public void test_0083()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1516, 1516, 1516, 14, 1516);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
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
  public void test_0085()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
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
  public void test_0087()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, (-241));
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
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
  public void test_0089()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getTime();
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
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
  public void test_0091()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 1);
      boolean boolean0 = DateUtils.isSameDay(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1388534400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2012, 2012, 2012, 2012, 2012);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = MockCalendar.getInstance();
      mockGregorianCalendar0.set((-1226), (-1226), (-1673), 6, 6, 6);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1556, 1556, 1556, 14, 14, 5);
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
  public void test_0095()  throws Throwable  {
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
  public void test_0096()  throws Throwable  {
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
  public void test_0097()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
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
  public void test_0099()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6, 6);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-61961997234000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=186,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=6,SECOND=6,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
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
  public void test_0101()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addHours(date0, 280000000);
      assertEquals("Wed May 16 12:21:21 GMT 33956", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
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
  public void test_0104()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addMonths(date0, 2646);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
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
  public void test_0106()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 1709);
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
        DateUtils.addWeeks((Date) null, 4767);
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
        DateUtils.addMinutes((Date) null, (-1606));
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
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(60000L, DateUtils.MILLIS_PER_MINUTE);
  }
@Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.add(4, (-1));
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 3600000, 60000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3, 3, 4, 3, 1000);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1936, (-1), 1936);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, (-1), 4);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 13);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=3,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=338,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      MockDate mockDate0 = new MockDate((-1632), (-1632), 1905);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 6, (-965));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2437, 2437, 0, 11, (-1206), 2437);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      assertEquals("Fri Jan 01 00:00:00 GMT 4540", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setFirstDayOfWeek((-2060));
      Calendar calendar1 = DateUtils.truncate(calendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-2060,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      MockDate mockDate0 = new MockDate(31315161600000L);
      Date date0 = DateUtils.truncate((Object) mockDate0, 9);
      assertEquals("Tue May 04 00:00:00 GMT 2962", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, (-15), 9, 9);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-15));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-15,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      mockGregorianCalendar0.setFirstDayOfWeek((-687));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-687,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Object) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 3093);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 13);
      assertEquals("Fri Feb 14 20:21:34 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-611), 4184, 4);
      Date date0 = DateUtils.addMonths(mockDate0, 4184);
      assertEquals("Fri Sep 04 00:00:00 GMT 1637", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1000, 5, 6);
      Date date0 = DateUtils.addMinutes(mockDate0, 3);
      assertEquals("Sun Jun 06 00:03:00 GMT 2900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMilliseconds(mockDate0, 280000000);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Tue Feb 18 02:08:01 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addHours(mockDate0, 13);
      assertEquals("Sat Feb 15 09:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-2320));
      assertEquals("Tue Oct 09 20:21:21 GMT 2007", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2437, 2437, 0, 11, (-1206), 2437);
      Date date0 = DateUtils.add(mockDate0, 11, 11);
      assertEquals("Sun Jan 31 02:34:37 GMT 4540", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000015, 2975, 8, 280000015, 8);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 284);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000015, 1784, 280000015, 1784, 280000015, 280000015);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 280000015);
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
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 280000000);
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
  public void test_0133()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 280000000, (-712), 1, (-712));
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, (-1));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000001, (-24), (-24), 2970, 2970, 1052);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1052);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000015, 21, 21);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, 2970);
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "5fe";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("5fe", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(350, (-1773), (-1773), (-1216), 1001, 177);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 2, 665);
      mockGregorianCalendar0.set(0, (-1270));
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
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addWeeks((Date) null, 412);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 0 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-984), 60000, 370, (-1429), (-1516), 2014);
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, (-220));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -220 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 11781, 11781);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 35117, 35117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 21, 86400000, 1, 693);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
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
  public void test_0148()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = MockCalendar.getInstance();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, calendar0);
      assertFalse(calendar0.equals((Object)mockGregorianCalendar0));
      
      dateUtils_DateIterator0.next();
      assertTrue(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, (-1389));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -1389 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
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
  public void test_0151()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(dateUtils0.UTC_TIME_ZONE);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 1001, 1001, 5, 2, 6);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=86400000,MONTH=1001,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1001,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=2,SECOND=6,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000001, (-15), (-15), 2970, 2970, 1052);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 280000000, 280000000, 280000000, 280000000);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 280000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 280000000 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 86400000, 1000, 3, 3);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1000,MONTH=86400000,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1000,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=3,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(86400000, 60000, 6, 21, (-298), 86400000);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=2726616357273720000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=86405002,MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=276,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=2,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, (-29));
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
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, (-1194));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000031, 21, 21);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 2);
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
      MockDate mockDate0 = new MockDate(60000, 3600000, 3600000, 3, 86400000);
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Mon Sep 27 03:00:00 GMT 371920", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 86400000, 1000, 3, 3);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7201150,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=1,DAY_OF_YEAR=219,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001, 1001, 1001);
      Date date0 = DateUtils.round((Date) mockDate0, 1001);
      assertEquals("Thu Feb 01 00:00:00 GMT 2987", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999992, 279999992, 1052, 279999992, 279999992, 1052);
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
  public void test_0166()  throws Throwable  {
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
  public void test_0167()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, (-1556));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1556 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-2413));
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
        DateUtils.truncate((Calendar) null, 1007);
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
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) null, 9);
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
        DateUtils.round((Object) null, (-466));
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
        DateUtils.round((Calendar) null, 280000001);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 499);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
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
  public void test_0176()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ";X\"@";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(";X\"@", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("(", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: (
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("Calendar value too large for accurate calculations", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
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
  public void test_0180()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 5, 86400000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(3600000, (-2033), 1);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, 6);
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167392000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1000, 5, 86400000);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(86400000, 1000, (-1), 4, 1435, (-2117));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(69939, 69939, 69939, 69939, 69939, 69939);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
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
  public void test_0185()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-284), 2351, (-546));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
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
  public void test_0187()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Calendar calendar1 = DateUtils.truncate(calendar0, 1001);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar1);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
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
  public void test_0189()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
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
  public void test_0191()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 7);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Fri Apr 04 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  public void test_0193()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
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
  public void test_0195()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-284), 2351, (-546));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(60000, 1000, 3600000, 1001, 3, 3);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
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
  public void test_0199()  throws Throwable  {
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
  public void test_0200()  throws Throwable  {
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
  public void test_0201()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
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
  public void test_0203()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62167564800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=364,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
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
  public void test_0205()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-284), 2351, (-546));
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-64994400000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=91,MONTH=5,WEEK_OF_YEAR=23,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=153,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1000);
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
        DateUtils.addSeconds((Date) null, 4880);
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
      // Undeclared exception!
      try { 
        DateUtils.addMonths((Date) null, 3);
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
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-1156));
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
        DateUtils.addMilliseconds((Date) null, 14);
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
        DateUtils.addYears((Date) null, 3);
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
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-3236));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      // Undeclared exception!
      try { 
        DateUtils.round((Object) dateUtils0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round org.apache.commons.lang.time.DateUtils@1
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(15, 279999990, 279999990, 24, 13, 279999990);
      mockGregorianCalendar0.set(279999990, 15, 15);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 24);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field 24 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(46, 1, 46, (-354), 46);
      Instant instant0 = MockInstant.ofEpochMilli(0L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-776));
      ZonedDateTime zonedDateTime0 = MockInstant.atZone(instant0, zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, gregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 10, 1, 37, (-2053), 10);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2053), (-3640), (-3640));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3674), (-2194), 2, (-706), (-3674), (-1406));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 1897, 2444, 45, 1897, (-1));
      Locale locale0 = Locale.forLanguageTag("MMH8?");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-3674), (-2194), 2, (-706), (-3674), (-1406));
      Date date1 = DateUtils.round((Object) mockGregorianCalendar0, 2);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertEquals("Sat Jan 01 00:00:00 GMT 3858", date1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(74, 74, 74);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1327, (-2147483646), 1327);
      MockDate mockDate1 = new MockDate((-2147483646), 1327, 1327, (-2147483646), (-2147483646));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate1, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(547, 547, (-143));
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-143));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 10);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-143,ERA=1,YEAR=592,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=3,DAY_OF_MONTH=10,DAY_OF_YEAR=70,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(13, 13, (-586));
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=12,MONTH=0,WEEK_OF_YEAR=23,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=153,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-2969));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-2969,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(547, 547, (-143));
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 14);
      Date date1 = DateUtils.truncate(date0, 5);
      assertTrue(date1.equals((Object)date0));
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, (-1049), 1);
      Date date0 = DateUtils.addDays(mockDate0, 1);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertEquals("Mon Aug 02 00:00:00 GMT 1813", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, (-1049), 1);
      Date date0 = DateUtils.addWeeks(mockDate0, 2151);
      assertEquals("Sun Oct 22 00:00:00 GMT 1854", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.addHours(mockDate0, 12);
      assertEquals("Thu Jan 01 12:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = DateUtils.add(mockDate0, 12, 12);
      assertEquals("Thu Jan 01 00:12:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2, 2);
      mockGregorianCalendar0.set(2, 2, (-184));
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, (-184));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DAY_OF_MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000017, 280000017, 280000017, 280000017, 280000017, 280000017);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 280000017);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 499, 1, 1, 280000000);
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
  public void test_0236()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001, 1001);
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
  public void test_0237()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 2379);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000125, 451, 451);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 451);
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
      String[] stringArray0 = new String[5];
      stringArray0[0] = ">nl\u0002&p'<^=@Msf";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(">nl\u0002&p'<^=@Msf", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'n'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379, 2379, 2379);
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
  public void test_0241()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379, 2379, 2379, 2379);
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
  public void test_0242()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1, 279999990, 279999990, 279999990, 1, 279999990);
      mockGregorianCalendar0.set(279999990, 1, 1);
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
  public void test_0243()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2013, 1765, 1002, 174, 174, 2013);
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
  public void test_0244()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-3227), (-3227), (-3227), (-3227), (-3227), (-3227));
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
  public void test_0245()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379, 2379, 2379);
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
  public void test_0246()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 573);
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
        DateUtils.addSeconds((Date) null, (-1030));
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
        DateUtils.addMonths((Date) null, 496);
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
        DateUtils.addMinutes((Date) null, (-1225));
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
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, (-2810));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, 955);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 1629, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 1999, 1999);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 3);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
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
  public void test_0258()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 2);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1391212800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(mockGregorianCalendar0.equals((Object)calendar0));
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, (-1047), 2379, 2444, 2444, 2379);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 2444);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 2444 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) "D>@ sk]L{6k_y[]#a", 2860);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on D>@ sk]L{6k_y[]#a
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 1470);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, (-517));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -517 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379, 2379, 2379);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=19377081540000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2584,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=13,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=39,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3, 86400000, 2560);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=227152868400000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7200157,MONTH=10,WEEK_OF_YEAR=46,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=310,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2, 2);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2,MONTH=2,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=2,SECOND=2,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 320);
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
        DateUtils.iterator((Date) null, 22);
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
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392465600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1767), (-1767), 0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-122568595200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1915,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=57,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.truncate(object0, 28);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate java.lang.Object@f08ed20
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1001);
      Date date0 = DateUtils.truncate((Object) mockDate0, 1001);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, (-3374));
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 2);
      assertEquals("Fri Feb 14 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 128);
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
        DateUtils.truncate((Date) null, 573);
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
      MockDate mockDate0 = new MockDate(280000000, 46, 46);
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
  public void test_0282()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.round(object0, (-2147483647));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round java.lang.Object@7ffb0da3
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3273), (-3273), (-3273), 835, 835, (-3273));
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-3273));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -3273 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-2233));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, 2113);
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, 280000000);
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
      String[] stringArray0 = new String[14];
      stringArray0[0] = "d";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("d", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("fg;v*}|evHS", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate(" o@DZ{N", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date:  o@DZ{N
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
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
  public void test_0291()  throws Throwable  {
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
  public void test_0292()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(1, 1);
      TimeZone timeZone0 = TimeZone.getTimeZone("z'Ho(}h3PZ\"");
      Locale locale0 = Locale.CHINA;
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(184, 1001, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Clock clock0 = MockClock.systemDefaultZone();
      Instant instant0 = MockInstant.now(clock0);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      ZonedDateTime zonedDateTime0 = MockInstant.atZone(instant0, zoneOffset0);
      GregorianCalendar gregorianCalendar0 = MockGregorianCalendar.from(zonedDateTime0);
      boolean boolean0 = DateUtils.isSameLocalTime(gregorianCalendar0, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(5, 5, 5);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(5, (-3833), 5, (-3833), 5);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2395, 2395, 2395, 2395, 2395, 2395);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2395, 2395, 2395);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(4651, 4651, 4651);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
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
  public void test_0299()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
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
  public void test_0301()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(13, 13, 13, 13, 13);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1912), (-1912), 10);
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
  public void test_0303()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameInstant(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
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
  public void test_0305()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = DateUtils.addMilliseconds(date0, 1001);
      boolean boolean0 = DateUtils.isSameInstant(date0, date1);
      assertFalse(boolean0);
      assertEquals("Fri Oct 15 00:00:01 GMT 1582", date1.toString());
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2912), 1, (-1), 280000000, 3066);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      MockDate mockDate0 = new MockDate(13, 0, 45, 28, (-599), (-686));
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
  public void test_0308()  throws Throwable  {
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
  public void test_0309()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay(calendar0, (Calendar) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2379, 2379, 2379, 2379, 2379, 2379);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2379, 2379, 2379, 477, 477);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), 3);
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(20, 20, 20);
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
  public void test_0313()  throws Throwable  {
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
  public void test_0314()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  public void test_0315()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
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
  public void test_0317()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
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
  public void test_0319()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
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
  public void test_0321()  throws Throwable  {
      MockDate mockDate0 = new MockDate(46, 46, (-546), (-354), (-354), (-546));
      Date date0 = DateUtils.addSeconds(mockDate0, (-546));
      assertEquals("Sat Apr 17 23:47:48 GMT 1948", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2912), 1, (-1), 280000000, 3066);
      Date date0 = DateUtils.addMonths(mockDate0, 2013);
      assertEquals("Tue May 02 19:06:00 GMT 30930", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addYears(mockDate0, 0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
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
  public void test_0325()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 6);
      assertEquals("Fri Feb 14 20:27:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(86400000L, DateUtils.MILLIS_PER_DAY);
  }
@Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999988, 14, 4227, 14, 14);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 14);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=8835884415987240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=280000000,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=25,DAY_OF_YEAR=269,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=14,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      Locale locale0 = Locale.GERMANY;
      Calendar calendar1 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392322881320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=44,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 12);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(12, (-1443), 3);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409260000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 12, 12, 12, 1001, 12);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-30545337600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1002,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=16,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Calendar calendar1 = DateUtils.round(calendar0, 12);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar1, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409260000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4171), (-4171), 26);
      Locale locale0 = Locale.GERMANY;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      MockDate mockDate0 = new MockDate(996, (-1120), 60000, (-1120), 45, 282);
      Date date0 = DateUtils.round((Date) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertFalse(boolean0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2966", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3281, 0, (-40), (-40), 3281, 0);
      Date date0 = DateUtils.truncate((Date) mockDate0, 0);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Tue Jan 01 00:00:00 GMT 5180", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4171), (-4171), 26);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(12, (-2928), 50, 26, 2014, (-1));
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 36, 36);
      MockDate mockDate1 = new MockDate((-2259), (-1), 0, (-849), (-3447));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1));
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 11);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, (-282), 0);
      Date date0 = DateUtils.truncate((Object) mockDate0, 0);
      assertEquals("Sun Jan 01 00:00:00 GMT 1899", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1636, 1, 1636, 1636);
      Date date0 = DateUtils.round((Date) mockDate0, 1);
      assertEquals("Sun Jan 01 00:00:00 GMT 1905", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setLenient(false);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-946));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 13);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-946,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setFirstDayOfWeek((-1));
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1636, 1, 1636, 1636);
      Iterator iterator0 = DateUtils.iterator((Object) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addDays(mockDate0, (-647));
      assertEquals("Tue May 08 20:21:21 GMT 2012", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3326, 0, 0, 0, 3326, 0);
      Date date0 = DateUtils.add(mockDate0, 11, 15);
      assertEquals("Fri Jan 02 22:26:00 GMT 5226", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280001900, 280001900, 3557, 3209, 13);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Date) mockDate0, 1398);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1432, 1751, 2404, 4227);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) mockGregorianCalendar0, 4227);
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
      MockDate mockDate0 = new MockDate(280000000, (-14), (-35), 39, 55, 55);
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
  public void test_0351()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
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
  public void test_0353()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(279999952, 279999952, 279999952);
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) mockGregorianCalendar0, 279999952);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, 1, 1, 1, 1001, 1001);
      mockGregorianCalendar0.set(0, 23);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockGregorianCalendar0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid era
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999976, (-58), (-58), (-58), 279999976, 279999976);
      // Undeclared exception!
      try { 
        DateUtils.round((Object) mockDate0, (-58));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ":%^S}{*hv2g]6Ps}V";
      // Undeclared exception!
      try { 
        DateUtils.parseDate(":%^S}{*hv2g]6Ps}V", stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'v'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      calendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        DateUtils.iterator(calendar0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      mockGregorianCalendar0.set(0, 2785);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) mockGregorianCalendar0, 6);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 3, 1, 280000000, 3, (-889));
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
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addYears((Date) null, 45);
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
        DateUtils.addWeeks((Date) null, (-3096));
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
  public void test_0363()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addMinutes((Date) null, (-372));
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
      // Undeclared exception!
      try { 
        DateUtils.addMilliseconds((Date) null, 95);
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
      // Undeclared exception!
      try { 
        DateUtils.addHours((Date) null, 1323);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4171), (-4171), 26);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-204760915200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=4520,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=177,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      // Undeclared exception!
      try { 
        DateUtils.iterator(calendar0, (-36));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style -36 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 2);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2424, "");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      Iterator iterator0 = DateUtils.iterator((Calendar) mockGregorianCalendar0, 5);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.round((Date) mockDate0, (-22));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -22 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.add((Date) null, 1713, 3600000);
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
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.add(mockDate0, 1000, 1000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Locale locale0 = new Locale("-", "-");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
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
  public void test_0377()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        DateUtils.iterator(object0, (-22));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not iterate based on java.lang.Object@7120cb8b
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1645, 1, 1645, 1645);
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockDate0, 4144);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 4144 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) null, 198);
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
      MockDate mockDate0 = new MockDate();
      Iterator iterator0 = DateUtils.iterator((Date) mockDate0, 4);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 3, 3, 3, 1, 1);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 3);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62127809939000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=93,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=1,SECOND=1,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        DateUtils.iterator((Object) mockGregorianCalendar0, 1669);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The range style 1669 is not valid.
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 4);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62030448000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=4,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=125,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.iterator((Calendar) null, 36);
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
      // Undeclared exception!
      try { 
        DateUtils.iterator((Date) null, 3600000);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, 3, 3);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 9);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=23,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=93,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      Calendar calendar1 = DateUtils.truncate(calendar0, 1001);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar1.toString());
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.round((Object) mockDate0, 9);
      assertEquals("Sat Feb 15 12:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) locale0, 244);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not truncate 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockDate0, (-1480));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field -1480 is not supported
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) null, 736);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(280000000, 1432, 1751, 2423, 4227);
      // Undeclared exception!
      try { 
        DateUtils.truncate((Object) mockGregorianCalendar0, 73);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Calendar value too large for accurate calculations
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.truncate((Calendar) null, 375);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
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
  public void test_0396()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        DateUtils.round((Object) locale0, 2420);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // Could not round fr
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.round((Object) null, (-1607));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Calendar) null, (-1961));
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
      // Undeclared exception!
      try { 
        DateUtils.round((Date) null, (-1675));
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
      String[] stringArray0 = new String[5];
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
  public void test_0401()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        DateUtils.parseDate("", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("Could not truncate ", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: Could not truncate 
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.parseDate("q", (String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Date and Patterns must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
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
  public void test_0405()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27859161600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1001, 1001, 1001, 1001, 1001);
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-27855187200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1087,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=3,DAY_OF_MONTH=16,DAY_OF_YEAR=106,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1476), (-1476), (-1476), (-1476), (-1476), (-1476));
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1476), 586, (-1476), (-2591), 14, (-3406));
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar1, mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, calendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-62135769600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
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
  public void test_0410()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      boolean boolean0 = DateUtils.isSameLocalTime(calendar0, calendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
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
  public void test_0412()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 1001);
      boolean boolean0 = DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392508800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=16,DAY_OF_YEAR=47,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
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
  public void test_0414()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
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
  public void test_0416()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addSeconds(mockDate0, 106);
      boolean boolean0 = DateUtils.isSameInstant(date0, (Date) mockDate0);
      assertEquals("Fri Feb 14 20:23:07 GMT 2014", date0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 14, 14, 5);
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
  public void test_0418()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), 0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
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
  public void test_0420()  throws Throwable  {
      MockDate mockDate0 = new MockDate(279999997, 279999997, 279999997);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 279999997);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Thu Jul 27 15:20:48 GMT 280446448", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(1001, 1001, 1001);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Locale locale0 = new Locale("-", "-");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-2928), (-2928), 1, 1, 1, 1);
      boolean boolean0 = DateUtils.isSameDay((Calendar) mockGregorianCalendar1, (Calendar) mockGregorianCalendar0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
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
  public void test_0424()  throws Throwable  {
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
  public void test_0425()  throws Throwable  {
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
  public void test_0426()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      boolean boolean0 = DateUtils.isSameDay(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
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
  public void test_0428()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-4171), (-4171), 26);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(mockGregorianCalendar0, mockGregorianCalendar0);
      dateUtils_DateIterator0.hasNext();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=-204761001600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=4520,MONTH=5,WEEK_OF_YEAR=26,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=176,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
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
  public void test_0430()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      Iterator iterator0 = DateUtils.iterator(calendar0, 6);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      MockDate mockDate0 = new MockDate(280000000, 11, (-35), 14, 55, (-1));
      Date date0 = DateUtils.addHours(mockDate0, 0);
      assertEquals("Fri Oct 26 14:54:59 GMT 280001900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
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
  public void test_0433()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), 6, 1, (-1));
      Date date0 = DateUtils.addMonths(mockDate0, 1001);
      assertEquals("Tue Dec 06 00:59:00 GMT 1898", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateUtils.addDays((Date) null, (-1432));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.apache.commons.lang.time.DateUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDate("", stringArray0);
      Date date1 = DateUtils.addYears(date0, 4);
      assertTrue(date1.equals((Object)date0));
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addWeeks(mockDate0, 3);
      assertEquals("Fri Mar 07 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 1);
      assertEquals("Fri Feb 14 20:22:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1001, DateUtils.SEMI_MONTH);
  }
}
