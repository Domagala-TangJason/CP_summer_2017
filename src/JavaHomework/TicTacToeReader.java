package JavaHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Jason on 3/23/2017.
 */
public class TicTacToeReader{
    public static void main(String[] args) {

        try {
            File myFile = new File("C:\\Program Files (x86)\\JetBrains\\TicTac.txt");
            Scanner scanner = new Scanner(myFile);
            int i = 0;
            while (scanner.hasNext()) {
                String currLine = scanner.nextLine();
                // Divide the string into array using the delimiter ;
                String[] elem = currLine.split(";");
                System.out.println(i + ": " + currLine);
                i++;
            }
        }catch (FileNotFoundException fe){
            System.out.println("Problem occured: " + fe.getMessage());
        }




    }
}
