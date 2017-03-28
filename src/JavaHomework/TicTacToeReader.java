package JavaHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TicTacToeReader {


    public static String[][] tempBoard = new String[3][3]; // Temporary grid used to parse string values
    public static int[][] finalBoard = new int[3][3]; // Final board in var int to apply logic to


    public static int rowWin() {
        for (int row = 0; row < 3; row++) {

            if (finalBoard[row][0] + finalBoard[row][1] + finalBoard[row][2] == 3)
                return 1;
            if (finalBoard[row][0] + finalBoard[row][1] + finalBoard[row][2] == 0)
                return -1;
        }
        return 0;
    }

    public static int colWin() {
        for (int col = 0; col < 3; col++) {

            if (finalBoard[0][col] + finalBoard[1][col] + finalBoard[2][col] == 3)
                return 1;
            if (finalBoard[0][col] + finalBoard[1][col] + finalBoard[2][col] == 0)
                return -1;
        }
        return 0;
    }


    public static int diagWin() {
        if (finalBoard[0][0] + finalBoard[1][1] + finalBoard[2][2] == 3 ||
                finalBoard[2][0] + finalBoard[1][1] + finalBoard[0][2] == 3)
            return 1;
        if (finalBoard[0][0] + finalBoard[1][1] + finalBoard[2][2] == -3 ||
                finalBoard[2][0] + finalBoard[1][1] + finalBoard[0][2] == -3)
            return -1;
        else {
            return 0;
        }
    }

    public static int whoWon() {
        if (rowWin() == 1 ||
                colWin() == 1 ||
                diagWin() == 1)
            return 1;
        if (rowWin() == -1 ||
                colWin() == -1 ||
                diagWin() == -1)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {


        try {
            File myFile = new File("C:\\Users\\Jason\\IdeaProjects\\CP_summer_2017\\src\\JavaHomework\\TicTacToe.txt");
            // Tried to get the file using ..\\ but it couldn't be found

            Scanner scanner = new Scanner(myFile);
            int i = 0;
            while (scanner.hasNext()) {
                String currLine = scanner.nextLine();
                // Divide the string into array using the delimiter ,
                String[] elem = currLine.split(",");
                tempBoard[i] = elem;
                i++;

            }
        } catch (FileNotFoundException fe) {
            System.out.println("Problem occured: " + fe.getMessage());
        }


        // Making the board into Integer type.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                finalBoard[i][j] = Integer.parseInt(tempBoard[i][j]);
            }
            System.out.println();
        }

        // calling functions to print out winner
        switch (whoWon()) {
            case 1:
                System.out.println("Congratulations! X's Won!");
                break;
            case -1:
                System.out.println("Congratulations! O's Won!");
                break;
            case 0:
                System.out.println("It's a draw!");
                break;
            default:
                System.out.println("Game is not finished!");
                break;
        }
    }
}

