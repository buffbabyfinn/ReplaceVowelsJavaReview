import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void method_input_result() {
    LeapYear leapYear = new LeapYear();
     assertEquals(true, leapYear.isLeapYear(2012));
  }
  
}
