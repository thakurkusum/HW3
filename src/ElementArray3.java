import java.util.Arrays;

public class ElementArray3 {

    public static void main(String[] args){

        int[] my_array ={36,54,34,56,76}; //insert an element in 3rd position of the array ( index_>2, value_>5)

        int Index_position =2;
        int newValue  =5;

        System.out.println("orignal Array : "+ Arrays.toString(my_array));

        for (int i = my_array.length-1; i >Index_position; i--){

            my_array[i] = my_array[i=1];
        }
        my_array[Index_position]=newValue;
        System.out.println("new Array: "+Arrays.toString(my_array));


    }

}
