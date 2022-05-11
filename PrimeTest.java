package q5hw;

import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeTest {

        Prime p = new Prime();
        @Test
        public void test2() {
                assertTrue(p.isPrime(2));
        }

        @Test
        public void test3() {
                assertTrue(p.isPrime(3));
        }

        @Test
        public void test4() {
                assertTrue(p.isPrime(4));
        }

        @Test
        public void test5() {
                assertTrue(p.isPrime(5));
        }

        @Test
        public void test6() {
                assertTrue(p.isPrime(6));
        }

   
}