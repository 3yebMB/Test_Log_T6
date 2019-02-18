import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] orig_arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println("Исходный массив : " + Arrays.asList(orig_arr));
        System.out.println("Обработанный массив : " + Arrays.asList(backArrAfterLastFour(orig_arr)));
    }

    public static <T extends Number> T[] backArrAfterLastFour(T[] arr) throws MyException {
        T[] result = null;
        ArrayList<T> alist = new ArrayList<T>();

        for (int i = arr.length; i > 0 ; i--) {
            if (arr[i].equals(4)) break;
//            else result[arr.length-i]
        }

        result = arr;

        return result;
    }

    class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
