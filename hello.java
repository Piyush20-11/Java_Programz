import java.util.*;
import java.lang.Math;
public class hello
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int digit=(int)Math.log10(n) + 1;
	    int x=n;
	    int rem,sum=0;
	    while(x!=0){
	        rem=x%10;
	        sum+=(int)Math.pow(rem,digit);
	        
	        x/=10;
	    }
	    if(n==sum){
	        		System.out.println("It is a Armstrong Number");
	    }
	    else
	        System.out.println("Not a Armstrong");
	    
	}
}
