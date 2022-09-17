/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to check Arstronmg number*/



import java.util.*;
import java.lang.Math;
public class prob1_g
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    //To get number of digit in a number
	    int digit=(int)Math.log10(n) + 1;
	    int x=n,rem,sum=0;
	    //Perform process of amstrong Number like 153=1^3 + 5^3 + 3^3
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
/*
Output:
153
It is a Armstrong Number
*/
