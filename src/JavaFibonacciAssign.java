/**
 * Created by Jason on 3/21/2017.
 */
public class JavaFibonacciAssign {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int countTo = 25;
        for (int i = 1; i <= countTo; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(first);


    }
}
