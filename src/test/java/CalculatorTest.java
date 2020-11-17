

import com.powerpuff.cardgame.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void additionTest(){
       var calc = new Calculator();

       assertEquals(10, calc.addition(5,5), "answer should ne 10");

    }

    @Test
    void subtractTest(){
        var calc = new Calculator();

        assertEquals(10, calc.subtract(20,10), "answer should ne 10");

    }
}
