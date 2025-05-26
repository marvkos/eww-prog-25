package at.technikum.basics;

import java.util.*;

public class Collections {

    private static int MAX_NUMBERS = 100000;

    public static void main(String[] args) {
        List<Long> numbersAL = new ArrayList<>();

        long start = System.currentTimeMillis();
        for (long i = 0; i < MAX_NUMBERS; i++) {
            numbersAL.addFirst(i);
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        System.out.println(timeElapsed);

        List<Long> numbersLL = new LinkedList<>();

        start = System.currentTimeMillis();
        for (long i = 0; i < MAX_NUMBERS; i++) {
            numbersLL.addFirst(i);
        }
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;

        System.out.println(timeElapsed);
    }
}
