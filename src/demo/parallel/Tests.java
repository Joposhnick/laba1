package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void divideTest(){
        var a = new Complex(15.48, 14.14);
        var b = new Complex(3.4, 2);
        var result = new Complex(5.2,1.1);
        assertEquals(result, a.divide(b));
    }

    @Test
    void minusTest(){
        var a = new Complex(2.5, 6.7);
        var b = new Complex(2.5, 7.4);
        var result = new Complex(0, -0.7);
        assertEquals(result, a.minus(b));
    }
}
