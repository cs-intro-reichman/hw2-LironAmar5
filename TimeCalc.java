public class TimeCalc {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]); 

        int sum = (hours * 60) + minutes + minAdd;

        sum = sum % 1440;

        System.out.println((sum / 60) / 10 + "" + (sum / 60) % 10 + ":" + (sum % 60) / 10 + "" + (sum % 60) % 10);
        
        
        
        
        
        
    }
}
