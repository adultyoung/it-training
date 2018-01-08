package string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = sc.nextLine();
        System.out.print("Введите слово: ");
        String str2 = sc.nextLine();
        System.out.println(isequals(str1,str2));
    }

    static boolean isequals(String str1, String str2) {
        str1 = str1.replaceAll("\\p{Punct}", "");
        str2 = str2.replaceAll("\\p{Punct}", "");
        String[] strArray = str1.split(" ");
        if ((strArray[0].equalsIgnoreCase(str2)) && (strArray[strArray.length-1].equalsIgnoreCase(str2))) {
            return true;
        }
        return false;
    }
}
