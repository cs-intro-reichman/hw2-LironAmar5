
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double pi = 1;
		double a = 1;
		double neg = - 1;
		while ( num  - 1 > 0 ){
        pi = pi + neg * (1 / ( a + 2 ));
		a = a + 2;
		neg = neg * ( -1 );
		num --;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi * 4) ;
	}
}
