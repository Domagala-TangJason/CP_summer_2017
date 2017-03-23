/**
 * Created by Jason on 3/22/2017.
 */
public class JavaRecursion {
        public static int countBowls(int row){
            if (row == 1) return 1;
            else return countBowls(row -1) + 2;
        }

    public static void main(String[] args) {

        int sum = countBowls(85);

        System.out.println(sum);
    }
}
