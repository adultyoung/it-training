package generics;

import java.math.BigDecimal;
import java.util.Scanner;

import static generics.Results.Math.getMath;
import static generics.Results.Math.getMathBigDec;

public class Results {
    public static void main(String[] args) {
        Number i1;
        Number i2;
        System.out.print("Введите любое число: ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            i1 = sc.nextInt();
        } else {
            i1 = sc.nextDouble();
        }
        System.out.print("Введите любое число: ");
        if(sc.hasNextInt()) {
            i2 = sc.nextInt();
        } else {
            i2 = sc.nextDouble();
        }
        InOutput <Number,Number> intInt = new InOutput<>(i1,i2);
        System.out.println("i1 + i2 = " + getMath(i1,i2));
        System.out.println("BigDecimal: i1 + i2 = " + getMathBigDec(i1,i2));
    }
    static class Math {

        static Number getMath(Number i1, Number i2) {
            if ((i1 instanceof Double) || (i2 instanceof Double)) {
                return i1.doubleValue() + i2.doubleValue();
            } else {
                return i1.intValue() + i2.intValue();
            }

        }

        static Number getMathBigDec(Number i1, Number i2) {
            BigDecimal big1 = new BigDecimal(i1.doubleValue());
            BigDecimal big2 = new BigDecimal(i2.doubleValue());
            return big1.add(big2);
        }


    }
}
