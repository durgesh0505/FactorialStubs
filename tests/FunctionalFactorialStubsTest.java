import org.junit.Test;
import java.io.File;
import static org.junit.Assert.*;

public class FunctionalFactorialStubsTest {

    @Test
    // This will test if the Factorial function will work on a positive integer
    public void factorialTestPositive() {

        FactorialStubs fact = new FactorialStubs();
        int num = 5;

        int expected = (120);
        int actual = fact.Factorial(num);
        assertEquals(expected, actual);
    }

    @Test
    // This will test if the Factorial function will work on a negative integer
    public void factorialTestNegative() {

        FactorialStubs fact = new FactorialStubs();
        int num = -6;

        int expected = (-720);
        int actual = fact.Factorial(num);
        assertEquals(expected, actual);
    }

    @Test
    // This will test if the Factorial function will work with zero
    public void factorialTestZero() {

        FactorialStubs fact = new FactorialStubs();
        int num = 0;

        int expected = (1);
        int actual = fact.Factorial(num);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTest() {
        FactorialStubs fact = new FactorialStubs();
        int num = 4;

        int expected = (0);   // Different expected output - failure
        int actual = fact.Factorial(num);
        assertNotEquals(expected, actual);
    }

    // The method should return true to indicate the file was found.
    @Test //(expected = ArrayIndexOutOfBoundsException.class)   //So when fails it does not break the suite
    public void fileConnectionTest() {

        FactorialStubs fact = new FactorialStubs();
        File f = new File("file.txt");
        boolean expected = true;
        boolean actual = fact.FileConnection(f);
        assertEquals(expected, actual);
    }

    //This will test that the output has been saved in a file
    @Test //(expected = ArrayIndexOutOfBoundsException.class)
    public void outputTest(){

        FactorialStubs fact = new FactorialStubs();
        File f = new File("file.txt");
        boolean expected = true;
        boolean actual = fact.output(f, 0);
        assertEquals(expected, actual);
        //  assertNotEquals(expected,actual);
    }

}