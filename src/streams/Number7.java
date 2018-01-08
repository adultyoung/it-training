package streams;

import java.io.*;

public class Number7 {
    public static void main(String[] args) {
        File file = new File("C:\\com\\code.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            FileOutputStream fos = new FileOutputStream("reverse.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            while (dis.available() != 0) {
                String reverse = new StringBuffer(dis.readLine()).reverse().toString();
                dos.writeUTF(reverse + "\n");
            }
            fis.close();
            dis.close();
            fos.close();
            dos.close();
            File reverse = new File("reverse.txt");
            FileInputStream rfis = new FileInputStream(reverse);
            DataInputStream rdis = new DataInputStream(rfis);
            int i;
            while((i=rfis.read())!=-1){
                System.out.print((char)i);
            }
            rfis.close();
            rdis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
