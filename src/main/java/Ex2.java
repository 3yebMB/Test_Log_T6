import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        Integer[] orig_arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println("Исходный массив : " + Arrays.asList(orig_arr));
        System.out.println("Обработанный массив : " + Arrays.asList(backArrAfterLastFour(orig_arr)));
    }

    public static <T extends Number> T[] backArrAfterLastFour(final T[] arr) throws MyException {
        T[] result = null;// = (T[]) new Number[arr.length];

        for (int i = arr.length-1; i > 0 ; i--) {
            if (arr[i].equals(4)) {
                result = (T[]) new Number[arr.length-i-1];
                System.arraycopy(arr, i+1, result, 0, arr.length-i-1);
                break;
            }
        }

        if (result==null) throw new MyException("В исходном массиве не встретилось ни одной 4-ки!");

        return result;
    }

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
