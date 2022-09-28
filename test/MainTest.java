import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void primenumbers(){

        int primeNumbers[] = Main.generatePrimeNumbers(40);
        long sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(2915, sum);

        primeNumbers = Main.generatePrimeNumbers(5);
        sum = 0;
        int check[] = {1, 2, 3, 5, 7};
        for(int i=0; i<primeNumbers.length; i++){
            assertEquals(check[i], primeNumbers[i]);
            sum = sum + primeNumbers[i];
        }
        assertEquals(18, sum);

        primeNumbers = Main.generatePrimeNumbers(20);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(569, sum);

        primeNumbers = Main.generatePrimeNumbers(1000);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(3674995, sum);

        primeNumbers = Main.generatePrimeNumbers(100);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(23593, sum);

        primeNumbers = Main.generatePrimeNumbers(10000);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(496060683, sum);

        primeNumbers = Main.generatePrimeNumbers(100000);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        long v = 62259399013L;
        assertEquals(v, sum);

        primeNumbers = Main.generatePrimeNumbers(10);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertNotEquals(10, sum);
    }

}