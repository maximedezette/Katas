import com.leapyears.LeapYearsCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest {

    LeapYearsCalculator leapYearsCalculator;

    @Before
    public void setUp(){
        leapYearsCalculator = new LeapYearsCalculator();
    }

    @Test
    public void shouldReturnTrueIfYearDivisibleBy400(){
        assertTrue(leapYearsCalculator.isLeapYear(400));
        assertTrue(leapYearsCalculator.isLeapYear(800));
        assertTrue(leapYearsCalculator.isLeapYear(2000));
    }

    @Test
    public void shouldReturnFalseIfYearDivisibleBy100ButNot400(){
        assertFalse(leapYearsCalculator.isLeapYear(1700));
        assertFalse(leapYearsCalculator.isLeapYear(1800));
        assertFalse(leapYearsCalculator.isLeapYear(1900));
        assertFalse(leapYearsCalculator.isLeapYear(2100));
    }

    @Test
    public void shouldReturnTrueIfYearDivisibleBy4ButNot100(){
        assertTrue(leapYearsCalculator.isLeapYear(2008));
        assertTrue(leapYearsCalculator.isLeapYear(2012));
        assertTrue(leapYearsCalculator.isLeapYear(2016));
    }

    @Test
    public void shouldReturnFalseIfYearNotDivisibleBy4(){
        assertFalse(leapYearsCalculator.isLeapYear(2017));
        assertFalse(leapYearsCalculator.isLeapYear(2018));
        assertFalse(leapYearsCalculator.isLeapYear(2019));
    }


}
