package generics;

import java.math.BigDecimal;

public class InOutput<I,D extends Number> {
    I i1;
    I i2;
    D d1;
    D d2;

    InOutput (I i1, I i2) {
        this.i1 = i1;
        this.i2 = i2;
    }
    }