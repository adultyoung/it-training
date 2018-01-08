package streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class VowelOutput {
    public static void main(String[] args) {
        try {
            FileInputStream myfile = new FileInputStream("C:\\com\\text.txt");
            DataInputStream dis = new DataInputStream(myfile);
            String[] words;
            while (dis.available() != 0) {
                words = dis.readLine().split(" ");
                for (String str : words) {
                    if (str.matches("^(?i:[aeiouy]).*")) {
                        System.out.print(str + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
