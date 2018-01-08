package collections;

import java.util.*;
import java.lang.*;
import java.text.*;
import java.util.regex.Pattern;

public class VocabularyHashMap {
    static HashMap<String, Integer> vocabulary = new HashMap<String, Integer>();
    static Scanner sc = new Scanner(System.in);

    public static boolean isWord(String s){
        for(int i = 0; i < s.length(); i++){
            if(!(Character.isDigit(s.charAt(i)) || Pattern.matches("\\p{Punct}", s))) {
                return false;
            }
        }
        return true;
    }

    public static String toAlpha(String s){
        return s.replaceAll("[^a-zA-Z]","");
    }

    public static void main (String[] args) throws java.lang.Exception {
        String s = sc.nextLine();
        String[] result = s.split("\\s");
        for (int x = 0; x < result.length; x++) {
            vocabulary.put(result[x], vocabulary.containsKey(result[x]) ? vocabulary.get(result[x]) + 1 : 1);
        }
        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x] + " " + vocabulary.get(result[x]));
        }
    }
}