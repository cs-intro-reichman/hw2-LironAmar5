
public class Cheers {
        public static void main(String[] args) {
	    String s = args[0];
            int num = Integer.parseInt(args[1]);

            String letters = "AEFHILMNORSX";
            int i = 0;
            s = s.toUpperCase();
            while ( i < s.length()){
               char c = s.charAt(i);
               if ( letters.indexOf( c ) == -1 ){
                 System.out.println("Give me a  " + c + ": " + c + "!");
               } 
               else {
                System.out.println("Give me an " + c + ": " + c + "!");
               }
               i ++;
            }
            System.out.println("What does that spell?");
            while (num > 0){
                System.out.println( s + "!!!");
                num --;
            }
        }
}
