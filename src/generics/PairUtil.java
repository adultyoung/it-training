package generics;

public final class PairUtil {
    public static <Integer> void swap (Integer test,Integer test1) {
        Pair<Integer, Integer> pair = new Pair<>(test, test1);
        System.out.println(pair.toString());
        test = pair.getTest();
        test1 = pair.getTest1();
        pair.setTest(test1);
        pair.setTest1(test);
        System.out.println(pair.toString());
    }
}
