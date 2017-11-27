import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        System.out.print("Введите сумму денег: ");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sc.close();
        int preLastDigit = sum % 100 / 10;
        if (preLastDigit == 1 || sum % 10 == 0 || sum % 10>=5){
            System.out.print(sum+" рублей");
        }else {
            if (sum % 10<5 && sum % 10>1) {
                System.out.print(sum + " рубля");
            }else{
                System.out.print(sum+" рубля");
            }
        }
    }
}
