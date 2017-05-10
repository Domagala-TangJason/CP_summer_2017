import java.io.File;

/**
 * Created by Jason on 3/29/2017.
 */
public class FileManipulation {

    public static void main(String[] args) {
        // System.getenv and System.getproperties are classes that java can use to interact with the system

        String home = System.getProperty("user.home");
        System.out.println(home);

        System.out.println(
                System.getProperty("java.io.tmpdir"));

        System.out.println(System.getenv("PATH"));

        System.out.println(System.getProperty("user.dir"));


        String tmpDir = System.getProperty("java.io.tmpdir");
        File tmpDirFile = new File(tmpDir);
        File[] fileList = tmpDirFile.listFiles();
        for (File f : fileList) {
            System.out.println(f + " " + f.isDirectory()
                    + " " + f.length());

        }


    }
}


