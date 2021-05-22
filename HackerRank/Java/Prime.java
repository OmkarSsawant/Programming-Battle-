import java.math.*;
import java.util.*;

class Prime{
	    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	 String n = scanner.nextLine();
	 System.out.println( new BigInteger(n,10).isProbablePrime(1) ? "prime" : "not prime" );
        scanner.close();		
	}
}