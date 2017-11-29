/**
 * @(#)Task_2.class   1.0  28/11/2017
 */
package Massive;

import java.util.ArrayList;

/**
 * Класс выделяет простые числа из множества целых чисел до 100.
 *  @version 1.0 29 Nov 2017
 *  @author Vlad Marchenko
 */

public class task_2 {
    public static void main(String[] args) {
        ArrayList i = new ArrayList();
        int count = 1;
        for (; count<=100; count++) {
            if((count % 13 == 0) || (count % 17 == 0)){
                i.add(count);
            }
        }
        System.out.println(i);
    }
}
