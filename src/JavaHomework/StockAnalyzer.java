package JavaHomework;

/**
 * Created by Jason on 4/5/2017.
 */

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StockAnalyzer {

    public static void main(String[] args) {


        File newFile = new File("D:/PercentChange.txt");

        File file = new File("C:\\Users\\Jason\\IdeaProjects\\CP_summer_2017\\src\\JavaHomework\\BlackstoneGroupData");
        //if (f.isFile()) {
            try {
                Scanner inputStream = new Scanner(file);
                inputStream.nextLine(); // ignores first line that gives titles
                double change = 0;
                FileWriter fw = new FileWriter(newFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                while (inputStream.hasNext()) {
                    String data = inputStream.nextLine();
                    String[] values = data.split(",");
                    String[] newValues = new String [values.length + 1];
                    System.arraycopy(values,0,newValues,0, values.length);
                    double closingPrice = Double.parseDouble(newValues[4]);
                    double openingPrice = Double.parseDouble(newValues[1]);
                    change = (closingPrice - openingPrice) / openingPrice;
                    System.out.println(change);

                    String changeString = String.valueOf(change);
                    newValues [7] = changeString;
                    for (String element: newValues) {
                        bw.append(element);
                        bw.append(",");
                    }
                    bw.newLine();
                  }
                inputStream.close();
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            }

        }






