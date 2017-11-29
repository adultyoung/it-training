/**
* @(#)Task_1.class   1.0  28/11/2017
 */
package Massive;

import java.util.Arrays;
import java.util.Collections;
/**
 *  Класс делает reverse первоначального массива
 *
 *  @version 1.0 29 Nov 2017
 *  @author Vlad Marchenko
 */
public class task_1 {
    public static void main(String[] args) {
        Integer arr[] = {0, 1, 2, 3, 4, 5}; //initialization of array
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        Integer[] brr = Arrays.copyOf(arr, arr.length); //getting copy of first array
        Collections.reverse(Arrays.asList(brr)); //reverse of array
        System.out.println("Измененный массив: " + Arrays.toString(brr));
    }
}
