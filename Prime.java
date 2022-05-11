package q5hw;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prime {
    public boolean isPrime(int number) {

            int count = 0;
            for (int i = 1; i <= number; i++) {

                    if (number % i == 0) {

                            count++;
                    }
            }

            if (count == 2) {
                    return true;
            } else {
                    return false;
            }
    }

}