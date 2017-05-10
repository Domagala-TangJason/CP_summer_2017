import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Jason on 3/29/2017.
 */
public class FileWrite {

    public static void main(String[] args) {
        File newFile = new File("D:/newfile.txt");
        try {
            FileWriter fw = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("abcdefgh");
            bw.newLine();
            bw.write("2nd line");
            bw.append("3rd line");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
