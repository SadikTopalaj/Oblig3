import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTest{

    @Test
    void IsYearDivicibleWith4ButNot100(){
        LeapYear test1 = new LeapYear();
        Assertions.assertTrue(test1.IsLeapYear(16));
        Assertions.assertFalse(test1.IsLeapYear(100));
    }
    @Test
    void IsYearDivicibleWith400(){
        LeapYear test2 = new LeapYear();
        Assertions.assertTrue(test2.IsLeapYear(400));
        Assertions.assertTrue(test2.IsLeapYear(800));
        Assertions.assertTrue(test2.IsLeapYear(1200));
    }

    @Test
    //Testing the example from the Acceptance criteria
    void AYearIsLeapYear(){
        LeapYear test3 = new LeapYear();
        Assertions.assertTrue(test3.IsLeapYear(2020));
    }
    @Test
    void YearIsNotDivicibleWith4(){
        LeapYear test4 = new LeapYear();
        Assertions.assertFalse(test4.IsLeapYear(17));
        Assertions.assertFalse(test4.IsLeapYear(19));
        Assertions.assertFalse(test4.IsLeapYear(2001));
        Assertions.assertFalse(test4.IsLeapYear(2011));
    }
    @Test
    void YearIsDivicibleWith100ButNot400(){
        LeapYear Test5 = new LeapYear();
        Assertions.assertFalse(Test5.IsLeapYear(900));
        Assertions.assertFalse(Test5.IsLeapYear(1900));
        Assertions.assertFalse(Test5.IsLeapYear(2100));
    }
    @Test
    //Testing all the examples from the Acceptance criteria
    void AYearIsNotLeapYear(){
        LeapYear test6 = new LeapYear();
        Assertions.assertFalse(test6.IsLeapYear(1700));
        Assertions.assertFalse(test6.IsLeapYear(1800));
        Assertions.assertFalse(test6.IsLeapYear(1900));
        Assertions.assertFalse(test6.IsLeapYear(2100));
    }
}
