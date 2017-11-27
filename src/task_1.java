import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.print("Введите первое слово: ");
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        System.out.print("Введите второе слово: ");
        String t2 = sc.next();
        if(t1.equals(t2)){
            System.out.println("Отлично! Слова одинаковы");
        }else {
            if(t1.equalsIgnoreCase(t2)){
                System.out.println("Хорошо. Почти одинаковы");
            }else {
                if(t1.length()==t2.length()){
                    System.out.println("Ну, хотя бы они одной длинны");
                }else{
                    System.out.println("Слова разные");
                }
            }
        }
    }
}
