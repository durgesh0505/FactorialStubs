import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialSyntaxCoverageTest {
    FactorialStubs factorial = new FactorialStubs();

    @Test
    void factorialMutant1() {
        //AOR:  fact = fact + i;
        int result = factorial.FactorialMutant1(5);
        int expected = 120;
        assertNotEquals(expected, result);
    }

    @Test
    void factorialMutant2() {
        //ROR:  else if( number <= 0){
        int result = factorial.FactorialMutant2(0);
        int expected = 1;
        assertNotEquals(expected, result);
    }

    @Test
    void factorialMutant3() {
        //UOI:  fact = fact * -i;
        int result = factorial.FactorialMutant3(4);
        int expected = 24;
        assertNotEquals(expected, result);
    }

    @Test
    void factorialMutant4() {
        //SVR:  fact = number * i;
        int result = factorial.FactorialMutant4(5);
        int expected = 120;
        assertNotEquals(expected, result);
    }

    @Test
    void factorialMutant5() {
        // ROR: if (number < 1){
        int result = factorial.FactorialMutant5(5);
        int expected = 120;
        assertNotEquals(expected, result);
    }

    @Test
    void factorialMutant6() {
        //ROR:  for (int i = 2; i < number; i++) {
        int result = factorial.FactorialMutant6(5);
        int expected = 120;
        assertNotEquals(expected, result);
    }


}