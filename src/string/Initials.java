package string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String fName = sc.nextLine();
        System.out.print("Введите фамилию: ");
        String lName = sc.nextLine();
        System.out.print("Введите отчество: ");
        String patronymic = sc.nextLine();
        System.out.println("Инициалы: " + getInitials(fName,lName,patronymic));
    }

    static String getInitials(String fName, String lName, String patronymic) {
        String str = lName.charAt(0) + "." + fName.charAt(0) + "." + patronymic.charAt(0);
        return str.toUpperCase();
    }
}
