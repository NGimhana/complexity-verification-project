package fMRI_Study_Classes;

import java.util.Arrays;

public class hIndex {
    public static void run() {
        int[] numbers = {2, 4, 1, 4, 9};
        System.out.print(compute(numbers));
    }

    //SNIPPET_STARTS
    public static int compute(int[] numbers) {
        Arrays.sort(numbers);

        int count = numbers.length;
        int result = 0;
        for (int i = count - 1; i >= 0; i--) {
            int current = count - i;
            if (numbers[i] >= current) {
                result = current;
            } else {
                break;
            }
        }

        return result;
    }
}