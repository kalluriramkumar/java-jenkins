import calculation.NumberClass;
import calculation.SubstractClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SubstractClass_Test {

    SubstractClass substractClass= new SubstractClass();


    @Test
    public void substract_numbers_test() {

        int expected_result = 10;

        int actual_result = substractClass.diffNumbers(30, 20);

        assertEquals(expected_result, actual_result);
    }


}
