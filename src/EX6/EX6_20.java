package EX6;

import java.util.Arrays;

public class EX6_20 {
    public static int[] shuffle(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;

        for (int i = 0; i < arr.length * 2; i++) {
            int x = (int) (Math.random() * arr.length);
            int y = (int) (Math.random() * arr.length);
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));

    }
}

