package streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Number4 {
    public static void main(String[] args) {
        try {
            FileInputStream myfile = new FileInputStream("C:\\com\\text.txt");
            DataInputStream dis = new DataInputStream(myfile);
            String[] words;
            while (dis.available() != 0) {
                words = dis.readLine().split(" ");
                for (int i = 0; i < words.length-1; i++) {
                    if (words[i].endsWith(String.valueOf(words[i+1].charAt(0)))) {
                        System.out.print(words[i] + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
