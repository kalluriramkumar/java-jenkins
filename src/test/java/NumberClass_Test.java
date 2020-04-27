import calculation.NumberClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberClass_Test {

    NumberClass numberClass = new NumberClass();


    @Test
    public void add_numbers_test() {

        int expected_result = 10;

        int actual_result = numberClass.addNumbers(5, 5);

        assertEquals(expected_result, actual_result);
    }

    @Test
    public void add_numbers_fail(){

        int expected_result = 20;

        int actual_result = numberClass.addNumbers(10, 10);

        assertEquals(expected_result, actual_result);

    }
}
