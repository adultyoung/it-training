package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
/*
* Класс создает список имен учащихся и выводит в консоль список в обратном порядке. (2 способами)
 */

public class Shoolmates {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        ListIterator<String> iter = names.listIterator();
        iter.add("Vlad");
        iter.add("Dmitriy");
        iter.add("Pedro");
        iter.add("Huan");
        iter.add("Jack");
        iter.add("Tony");
        LinkedList<String> reverse = new LinkedList<>();
        while (iter.hasPrevious()) {
            String a = iter.previous();
            reverse.add(a);
        }
        System.out.println("original - " + names.toString());
//        Collections.reverse(names);
//        System.out.println("reverse - " + names.toString());
        System.out.println("reverse - " + reverse.toString());
    }
}
