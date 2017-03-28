import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Jason on 3/22/2017.
 */
public class TextFileRead {
    public static void main(String[] args) throws FileNotFoundException{
/* how to take an input in Java
        System.out.println("Please provide input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(input);

        */

    try {
        File myFile = new File("C:\\Users\\Jason\\IdeaProjects\\CP_summer_2017\\src\\JavaHomework\\TicTacToe.txt");
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
