
package coursera;
import java.io.*;

public class javaIO {
    public static void main(String[] args) {
        try {
            //File inputFile = new File("C:\\Coursera\\hello.txt");
            //FileOutputStream fo = new FileOutputStream(inputFile);
            
            FileWriter fw = new FileWriter("C:\\Coursera\\hello.txt");
            for (int i = 0; i < 10; i++) {
                
                fw.write((int)(Math.random()*99)+System.getProperty("line.separator"));//to write numbers in a separate line.
                
            }
            System.out.println("Success");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
