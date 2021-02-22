import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FizzBuzzTest {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger( FizzBuzzTest.class );

    @Test
    public void returnsZeroOnBegin(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        result = fizzBuzz.current();
        Assertions.assertEquals("0", result);
    }

    @Test
    public void incrementNumberWhenNextIsCalled(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        result = fizzBuzz.current();
        Assertions.assertEquals("0", result);

        fizzBuzz.next();
        result = fizzBuzz.current();
        Assertions.assertEquals("1", result);

        fizzBuzz.next();
        result = fizzBuzz.current();
        Assertions.assertEquals("2", result);
    }

    @Test
    public void returnsFizzIfDividableBy7(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 0; i < 8 ; ++i){
            fizzBuzz.next();
        }

        result = fizzBuzz.current();
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void returnsFizzForFirst10kNumbersIfDividableBy7(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 0; i < 10000 ; ++i){
            fizzBuzz.next();
            String result = fizzBuzz.current();
            if(i % 7 == 0 && i != 0) {
                Assertions.assertEquals("Fizz", result);
            } else {
                Assertions.assertEquals(String.valueOf(i), result);
            }
        }
    }
}
