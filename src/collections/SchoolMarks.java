package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
/*
* Класс создает список отметок учащихся через ListIterator, находит максимальную отметку, выстраивает отметки в порядке возрастания.
 */

public class SchoolMarks {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int max = 0;
        LinkedList<Integer> marks = new LinkedList<>();
        ListIterator<Integer> iterator = marks.listIterator();
          for (int i = 0; i < 5; i++) {
              int count = rand.nextInt(10)+1;
              iterator.add(count);
              //нахождение максимального значения
              if (count>max) {
                  max=count;
              }
          }
          //Расстановка отметок в порядке возрастания.
//        while(iterator.hasPrevious()){
//            int next = iterator.previous();
//            if(next == 1 || next == 2 || next == 3)
//                iterator.remove();
//        }
        //Вывод результатов.
        System.out.println(marks.toString());
        System.out.println("max - " + max);
    }
}
