package casings;

import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        System.out.print("int 1: ");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        System.out.print("int 2: ");
        int i2 = sc.nextInt();
        System.out.print("double 1: ");
        double d1 = sc.nextDouble();
        System.out.print("double 2: ");
        double d2 = sc.nextDouble();
        InOutput intInt = new InOutput(i1,i2);
        System.out.println("i1 + i2 = " + intInt.getMath(i1,i2));
        System.out.println("BigDecimal: i1 + i2 = " + intInt.getMathBigDec(i1,i2));
        InOutput doubleDouble = new InOutput(d1,d2);
        System.out.println("d1 + d2 = " + doubleDouble.getMath(d1,d2));
        System.out.println("BigDecimal: d1 + d2 = " + doubleDouble.getMathBigDec(d1,d2));
        InOutput intDouble = new InOutput(i1,d1);
        System.out.println("i1 + d1 = " + intDouble.getMath(i1,d1));
        System.out.println("BigDecimal: i1 + d1 = " + intDouble.getMathBigDec(i1,d1));
        InOutput doubleInt = new InOutput(d2,i2);
        System.out.println("d2 + i2 = " + doubleInt.getMath(d2,i2));
        System.out.println("BigDecimal: d2 + i2 = " + doubleInt.getMathBigDec(d2,i2));
    }
}
