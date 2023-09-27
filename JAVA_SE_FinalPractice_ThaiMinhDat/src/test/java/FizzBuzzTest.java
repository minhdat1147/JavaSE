
import fa.training.problem01.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void test_case1(){
        System.out.println("Test main success");
        String result = fizzBuzz.fizzBuzz(5);
        Assertions.assertTrue(result.equals("Buzz"));

    }
    @Test
    void test_case2(){
        System.out.println("Test main success");
        assertEquals("1", fizzBuzz.fizzBuzz(1));
    }
    @Test
    void test_case3(){
        System.out.println("Test main success");
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
    }
    @Test
    void test_case4(){
        System.out.println("Test main success");
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

}
