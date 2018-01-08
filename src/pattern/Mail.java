package pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur email: ");
        String mail = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+([_]?\\w+)*@\\w+.(org|com)$");
        Matcher matcher = pattern.matcher(mail);
        System.out.print("Is it real email? " + matcher.find());

        System.out.println("enter text with paragraph tags: ");
        String paragraph = sc.nextLine();
        Pattern tag = Pattern.compile("[<p](\\s\\w)?[>]");
        Matcher tags = tag.matcher(paragraph);
        paragraph = tags.replaceAll("<p>");
        System.out.println("Here your changed text: " + paragraph);

        System.out.println("enter text with telephone number: ");
        String text = sc.nextLine();
        Pattern number = Pattern.compile("[+375]\\d{9}");
        Matcher numb = number.matcher(text);
        numb.find();
        System.out.println("Here telephone numbers that i found: " + numb.group());

        System.out.print("Enter ur text for IPv4 test: ");
        String ipv4 = sc.nextLine();
        Pattern address = Pattern.compile("^[0-255].[0-255].[0-255].[0-255]$");
        Matcher ad = address.matcher(ipv4);
        System.out.print("Is it IPv4 address? " + ad.find());
    }
}
