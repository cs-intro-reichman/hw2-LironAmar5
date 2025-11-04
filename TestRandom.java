
public  class  TestRandom {
	public static void main(String[]  args) {
	    
		int n = Integer.parseInt(args[0]);
        int above = 0, below = 0;

		while ( n > 0) {
			if ( Math.random() <  0.5) { 
				below ++;
				n --;
			}
			else { 
				above ++;
				n --;
			}
		}
        
		System.out.println("> 0.5: " + below);
		System.out.println("<= 0.5: " + above );
		if ((above != 0) && (below != 0)){System.err.println("Ratio: " + (double)(above) / (double)(below)); }
	}
}
