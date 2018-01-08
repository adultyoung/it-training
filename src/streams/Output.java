package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Output{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\com\\text.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
