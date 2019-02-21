import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1,1,4,4,4,4,1,1,4,1,4,4,1};

        System.out.println(Arrays.toString(arr));
        System.out.println(checkArray(arr));
    }

    public static boolean checkArray(int[] mas) {
        boolean one = false;
        boolean four = false;

        for (int i = 0; i < mas.length; i++) {
            if (one & four) break;
            if (mas[i] == 1) one = true;
            if (mas[i] == 4) four = true;
        }

        return (one && four)?(true):(false);
    }
}
