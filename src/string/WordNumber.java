package string;

public class WordNumber {
    public static void main(String[] args) {
        String str = "Documentation     and examples for Bootstrap's logo and brand usage guidelines. Have a need for Bootstrap's brand resources? Great! We have only a few guidelines we follow, and in turn ask you to follow as well. These guidelines were inspired by MailChimp's";
        System.out.println(getWordNumber(str));
    }

    static int getWordNumber (String str) {
        str = str.replaceAll("\\p{Punct}", "");
        str = str.replaceAll("[\\s]{2,}", " ");
        String[] number = str.split(" ");
        return number.length;
    }
}
