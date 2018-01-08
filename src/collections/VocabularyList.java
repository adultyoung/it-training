package collections;

import java.util.*;
import java.util.regex.Pattern;

public class VocabularyList {
    static String s;
    static String[] result = new String[]{};
    static ArrayList<String> text = new ArrayList<>();


    public static void main(String arg[]){
        VocabularyList MU = new VocabularyList();
        addString();
        toAlpha(s);
        addTokens();
        ListIterator<String> count = text.listIterator();
        if (count.hasNext()) {
            for (int i = 0; i<text.size(); i++) {

            }
        }

    }
    //Ввод строки из консоли.
    static void addString () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст на английском: ");
        s = sc.nextLine();
    }
    //Разделяем текст на токены и передаем их поочередно в коллекцию.
    static void addTokens () {
        result = s.split("\\s");
            for (int i = 0; i<result.length; i++) {
                text.add(result[i]);
            }
    }
    // Удаляем все знаки, не имеющие отношения к словам.
   static String toAlpha(String s){
        return s.replaceAll("[^a-zA-Z]","");
    }
}