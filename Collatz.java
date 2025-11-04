
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String s = args[1];
        boolean k = false;
		int temp = 1;
		int start ;
        
		if ( s.equals("v")) {
		for (int i = 1; i <= num; i++) {
			start = i;
			while ( k == false ){
				
				if ( start % 2 == 1){
                 System.out.print( start + " ");
                 start = (start * 3) + 1 ;
				 temp ++;
				}
				else {
					System.out.print( start + " ");
					start = start / 2;
					temp ++;
				}

				if (start == 1){ 
					k = true;  
					System.out.println( start + " (" + temp + ")");
				}
			}
             temp = 1;
			 k = false;
		}
		System.out.println("Every one of the first " + num +" hailstone sequences reached 1.");
		
	}
	 else  {
		for (int i = 1; i <= num; i++) {
			start = i;
			while ( k == false ){
				
				if ( start % 2 == 1){
                 
                 start = (start * 3) + 1 ;
				 temp ++;
				}
				else {
					
					start = start / 2;
					temp ++;
				}

				if (start == 1){ 
					k = true;  
					
				}
			}
             temp = 1;
			 k = false;
		}
		System.out.println("Every one of the first " + num +" hailstone sequences reached 1.");
		
	}
	
    
}
}
