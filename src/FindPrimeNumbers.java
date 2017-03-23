/**
 * Created by Jason on 3/15/2017.
 */
public class FindPrimeNumbers {


    public static void main(String[] args) {

        /*
         Use a loop to run through the factors, and spit out the prime factors. For all the numbers counting up to x,
         find out of the mod == 0, in this case, it will be a prime. Keep running until it reaches x.
         */
        int n;
        n = 75;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
            } else if (n % i != 0) {
                continue;
            }
        }




    }
}


        // Find the prime number using recursion







