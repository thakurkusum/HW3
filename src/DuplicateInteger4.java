import java.util.Arrays;

public class DuplicateInteger4 {

    public static void main(String[] args) {
        int[] my_Array = {2, 4, 7, 7, 3, 3, 4, 9};
        int var = 0;
        Arrays.sort(my_Array);
        for (int i = 0; i < my_Array.length-1; i++) {

            int count = 1;
            while (my_Array[i] == my_Array[i + 1]) {
                count++;
                var = my_Array[i];
                i++;
                System.out.println("duplicate element :" +my_Array[i]);

            }

        }
    }
}