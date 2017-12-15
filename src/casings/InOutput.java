package casings;

import java.math.*;

public class InOutput {
    int i1;
    int i2;
    double d1;
    double d2;

    InOutput (int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }
    InOutput (double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    InOutput (int i1, double d1) {
        this.i1 = i1;
        this.d1 = d1;
    }
    InOutput (double d2, int i2) {
        this.i2 = i2;
        this.d2 = d2;
    }
    int getMath (int i1, int i2) {
        return i1+i2;
    }
    double getMath (double d1, double d2) {
        return d1+d2;
    }
    Number getMath (int i1, double d1) {
        return i1+d1;
    }
    Number getMath (double d2, int i2) {
        return d2+i2;
    }
    Number getMathBigDec (int i1, int i2) {
        BigDecimal big1 = new BigDecimal(i1);
        BigDecimal big2 = new BigDecimal(i2);
        return big1.add(big2);
    }
    Number getMathBigDec (double d1, double d2) {
        BigDecimal big1 = new BigDecimal(d1);
        BigDecimal big2 = new BigDecimal(d2);
        return big1.add(big2);
    }
    Number getMathBigDec (int i1, double d1) {
        BigDecimal big1 = new BigDecimal(i1);
        BigDecimal big2 = new BigDecimal(d1);
        return big1.add(big2);
    }
    Number getMathBigDec (double d2, int i2) {
        BigDecimal big1 = new BigDecimal(d1);
        BigDecimal big2 = new BigDecimal(d2);
        return big1.add(big2);
    }
}
