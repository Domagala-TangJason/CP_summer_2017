/**
 * Created by Jason on 3/20/2017.
 */
public class JavaArrays {
    public static void main(String[] args) {
        // Arrays are used to store lots of unifrom data values
        int [] a = {10, 20, 30, 40, 50};

        System.out.println(a[2] + " " + a[4]);

        // enhanced for - to print out all values in the array
        for (int var : a){
            System.out.println(var);
        }

        // declaring an array with fixed spaces in it (here it makes 5 spaces) with values of 0 in them
        int [] x = new int[5];
        x[3] = 25;
        x[0] = 12;

        // String arrays. Blank values in string arrays are null values.
        String[] st = new String[5];
        st[2] = "Hey";
        st[4] = "24";

        // Two dimensional arrays. Function like a matrix.
        int [][] TwoDim = new int[4][3];
        // TwoDim [2][1] = 10;  -- will assign a value of 10 to this slot

        int temp = 10;
        for(int i = 0; i<4;i++){
            for(int j = 0; j < 3; j++){
                TwoDim[i][j] =temp;
                temp += 10;
            }
        }

        for(int i = 0; i<4;i++){
            for(int j = 0; j < 3; j++){

                System.out.print(TwoDim[i][j] + " ");

            }
            System.out.println();
        }








    }
}
