package tiku.p002;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class P2 {
    public static void main(String[] args) throws IOException {
        int i;
        char c;

        try(FileInputStream fis = new FileInputStream("D:\\IDEAproject\\geekbank_javacore\\src\\main\\java\\tiku\\p002\\course.txt");
            InputStreamReader isr = new InputStreamReader(fis);){

            while(isr.ready()){
                isr.skip(2);
                i = isr.read();
                c = (char) i;
                System.out.println(c);
            }
        }
    }
}
