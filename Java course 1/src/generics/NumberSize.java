package generics;

public class NumberSize {
    public static void main(String[] args) {
        long[] a = new long[10];
        byte[] b = new byte[10];
        double[] c = new double[10];
        String[] d = new String[10];
        int sizeOfa = 16 + 4 + 16 + a.length*8 + 4;
        int sizeOfb = 16 + 4 + 16 + b.length*1 + 2;
        int sizeOfc = 16 + 4 + 16 + c.length*8 + 4;
        int sizeOfd = 16 + 4;
        System.out.println("size of Long[10]: " + sizeOfa);
        System.out.println("size of Byte[10]: " + sizeOfb);
        System.out.println("size of Double[10]: " + sizeOfc);
        System.out.println("size of String[10]" + sizeOfd);
    }
}
