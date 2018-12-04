import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class OddEven11 {

    public static void main(String[]args){

        int[]array_sort = {2, 3, 7,56,77,36,20};
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i : array_sort){
            if((i & 1)== 1){
                odd.add(i);
            }
            else{
                even.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println("odd:"+odd);
        System.out.println("even:"+even);

    }
}
