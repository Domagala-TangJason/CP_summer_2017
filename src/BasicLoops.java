/**
 * Created by Jason on 3/15/2017.
 */
public class BasicLoops {

    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            if (i == 6) continue;
            System.out.println("i " + i);
           // continue means to go on to another iteration
            if (i > 7) break;
            // this will still print 8, because it is after the condition
        }
        /*
        for (int j=5; j<0;j--) {
            System.out.println("j=" +j);
        } Doesnt work because it is outside the bounds*/

        int k=0;
        while (k<10) {
            System.out.println("k= " + k);
            k++;
            // need to manually increase the k afterwards
        }

        int m=10;
        do {
            System.out.println("m= "+m);
            m--;
            // do while will execute the code at least once
        } while (m < 5);

    }
}
