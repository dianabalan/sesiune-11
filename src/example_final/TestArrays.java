package example_final;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {


        int[] arr = {6, 2, 8, 4, 1};

        System.out.println(Arrays.toString(arr));

        int[] arrBigger = Arrays.copyOf(arr, 10);

        System.out.println(Arrays.toString(arrBigger));

        int[] newArr = Arrays.copyOfRange(arr, 0,2);

        System.out.println(Arrays.toString(newArr));
    }
}
