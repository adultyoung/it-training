package generics;

public class Pair<K,V> {
    K test;
    V test1;

    public K getTest() {
        return test;
    }

    public V getTest1() {
        return test1;
    }

    public void setTest(K test) {
        this.test = test;
    }
    public void setTest1(V test1) {
        this.test1 = test1;
    }
    Pair (K test,V test1) {}
    public String toString () {
        return test.getClass().getName() + " " + test + " " + test1;
    }
}
