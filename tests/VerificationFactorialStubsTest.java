import org.junit.Test;

import java.io.File;
import static org.junit.Assert.*;

public class VerificationFactorialStubsTest {

    @Test
    public void factorialTestPositive() {
//  This will test if the Factorial function will work on a positive integer
        FactorialStubs fact = new FactorialStubs();
        int num = 5;

        int expected = (120);
        int actual = fact.Factorial(num);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTestZero() {
//  This will test if the Factorial function will work with zero
        FactorialStubs fact = new FactorialStubs();
        int num = 0;

        int expected = (1);
        int actual = fact.Factorial(num);
        assertEquals(expected, actual);
    }


    @Test //(expected = ArrayIndexOutOfBoundsException.class)
    public void fileConnectionTestTrue() {
//  The method should return true to indicate the file was found.

        FactorialStubs fact = new FactorialStubs();
        File f = new File("file.txt");
        boolean expected = true;
        boolean actual = fact.FileConnection(f);
        assertEquals(expected, actual);
    }

    @Test
    public void fileConnectionTestFalse() {
//  The method should return false to indicate the file was not found.

        FactorialStubs fact = new FactorialStubs();
        File f = null;
        boolean expected = false;
        boolean actual = fact.FileConnection(f);
        assertEquals(expected, actual);
    }

    @Test  //(expected = ArrayIndexOutOfBoundsException.class)
    public void outputTestTrue(){
//  This will test that the output has been saved in a file
        FactorialStubs fact = new FactorialStubs();
        File f = new File("file.txt");
        boolean expected = true;
        boolean actual = fact.output(f, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void outputTestFalse() {
//  The method should return false to indicate the file was not written to.
        FactorialStubs fact = new FactorialStubs();
        File f = null;
        boolean expected = false;
        boolean actual = fact.output(f,0);
        assertEquals(expected, actual);
    }
}