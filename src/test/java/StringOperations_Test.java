import StringPackage.StringOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOperations_Test {

    StringOperations stringOperations = new StringOperations();

    @Test
    public void splitString_test() {
        String str = "Sample String";

        String[] actualResult = stringOperations.splitString(str);

        assertEquals(actualResult[0], "Sample", "String Mismatch");

        assertEquals(actualResult[1], "String");
    }

}