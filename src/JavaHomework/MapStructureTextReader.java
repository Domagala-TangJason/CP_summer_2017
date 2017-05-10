package JavaHomework;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MapStructureTextReader {


    public static void main(String[] args) throws IOException {

        File myFile = new File("C:\\Users\\Jason\\IdeaProjects\\CP_summer_2017\\src\\JavaHomework\\TheBrain");
        BufferedReader reader = new BufferedReader(new FileReader(myFile));

        Map<String, Integer> textMap = new HashMap<String, Integer>();

        String line = reader.readLine();
        while (line != null){

            if(!line.trim().equals(" ")){
                String [] words = line.split(" ");

                for(String word : words){
                    if(word == null || word.trim().equals("")){
                        continue;
                    }
                    String processed = word.toLowerCase();
                    processed = processed.replace(",", "");
                    processed = processed.replace(".", "");
                    processed = processed.replace("!", "");
                    processed = processed.replace("?", "");

                    if(textMap.containsKey(processed)){
                        textMap.put(processed, textMap.get(processed) + 1);
                    } else {
                        textMap.put(processed, 1);
                    }
                }
            }

            line = reader.readLine();
        }
        for(String key : textMap.keySet()){
            System.out.println("'" + key + "'" + " appears " + textMap.get(key) + " times.");
        }
    }
}
