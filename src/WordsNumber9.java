public class WordsNumber9 {
    public static void main(String[]args){
        String test = "Java is most popular and secure language";
        count (test);

    }
     public static void count(String x){
         char[]ch =x.toCharArray();
         int letter =0;
         int space =0;
          for (int i=0; i< x.length(); i++){
              if (Character.isLetter(ch[i])){
                  letter ++;
              }
              else if (Character.isSpaceChar(ch[i])){
                  space ++;
              }
              }
         System.out.println("Java is most popular and secure language");
         System.out.println("letter:"+ letter);
         System.out.println("space:"+ space);
          }
     }


