package classes;

import static classes.Bankomat.summ100;
import static classes.Bankomat.summ20;
import static classes.Bankomat.summ50;

public class Bankomat_Test {


    public static void main(String[] args) {
        Bankomat one = new Bankomat(summ20, summ50, summ100);
        one.add20();
        one.add50();
        one.add100();
        boolean ifcash = one.Cash(summ20,summ50,summ100);
        System.out.println(ifcash);
    }

}
