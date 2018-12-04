public class SpecificValue2 {
    public static boolean contains(int[] arr, int item){
     for( int n : arr){
         if ( item == n){
             return true;
         }
     }
     return false ;
    }
    public static void main(String[]args){
        int[] my_array1 = {
                2015, 2014,2017,2012,
                1986,1970,1976,1950};
        System.out.println(contains(my_array1,2015));
        System.out.println(contains(my_array1,1989));

        }
    }

