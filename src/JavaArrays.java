/**
 * Created by Jason on 3/20/2017.
 */
public class JavaArrays {

    static Double sumArray(Double[] arr) {
        double result = 0.0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }


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

        // class notes
        // If we defined the array as Integer arInt, then the 0 will be null values
        int[] arInt = new int[3];
        arInt[0] = 5;
        arInt[1] = 7;

        for (int i=0;i<arInt.length;i++){
            System.out.println(arInt[i]);
        }

        String[] arStr = new String[] {
                "abc","def","ghi"
        };
        // size of the array cannot change once it is defined
        for (int j=0;j<arStr.length;j++){
            System.out.println(arStr[j]);
        }

        //for each
        for (String element: arStr){
            System.out.println("for each " + element);
        }

        Double[] arDouble = new Double[]{
                54.24,652.3,21.03
        };
        System.out.println(sumArray(arDouble));










    }
}
