package src.learnjava.designmodul;

import java.util.Arrays;

public class LambdaArrays {
    public static void main(String[] args) {
        var arr1 = new String[]{"java", "php", "javascripts", "groovy"};
        // Comparator接口的实例
        Arrays.parallelSort(arr1, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr1));

        var arr2 = new int[]{1,-2,3,-4,5};
        // IntBinaryOperator接口的实例
        Arrays.parallelPrefix(arr2, (left, right) -> left * right);
        System.out.println(Arrays.toString(arr2));

        var arr3 = new long[5];
        // IntToLongFunction接口的实例
        Arrays.parallelSetAll(arr3, operand -> operand*5);
        System.out.println(Arrays.toString(arr3));
    }
}
