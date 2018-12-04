import java.util.HashSet;

public class CommenElement5 {
    public static void main(String[]args){
        String[]s1 ={"RAJ","MANU","ROSE","RIYA","RAHUL"};
        String[]s2 = {"MANU","RAHUL","PIYA","KIYA","ROSE"};
        HashSet<String> set =new HashSet<String>();

        for (int i=0; i <s1.length;i++){
            for( int j=0; j<s2.length;j++){
                if (s1[i].equals (s2[j])){
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);

    }
}
