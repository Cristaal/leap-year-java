import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYear testLeapYear = new LeapYear();
    assertEquals(true, testLeapYear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forMultiplesOfFourHundred_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals( true, leapYear.isLeapYear(2000) );
  }
}
