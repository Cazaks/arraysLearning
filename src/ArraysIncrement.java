import java.util.Arrays;

public class ArraysIncrement {
    public static int[] arrayIncrement(int[] val) {

        int[] newVal = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            newVal[i] = val[i] +2;
        }
        return newVal;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrayIncrement(arr)));
    }
}
