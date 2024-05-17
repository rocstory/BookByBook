// How I was able to read from the test.txt file:
// https://stackoverflow.com/questions/3844307/how-to-read-file-from-relative-path-in-java-project-java-io-file-cannot-find-th

package chp3;

import java.io.*;

public class InputTest {
    public void run() {
        int c;

        try {
            InputStream filepath = getClass().getResourceAsStream("test.txt");
            // System.out.println("url:" + url);

            // Had troubles reading the file in the same way thats shown in the textbook
            // It didnt work...
            // String filePath = new File(".").getCanonicalPath();
            // System.out.println(new File(".").getCanonicalPath());
            // String fileName = filePath + "/DesignPatterns/DPWorkbench/src/chp3/test.txt";
            // System.out.println(fileName);

            InputStream in =
                    // Our decorator
                    new LowerCaseInputStream(
                            // stores the data for our decorator to use.
                            new BufferedInputStream(filepath));

            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }

            in.close(); // DONT FORGET TO CLOSE THE FILE!!!!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
