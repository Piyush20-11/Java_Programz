
/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to check the number is Palindrome or not*/

import java.util.*;
import java.lang.*;
public class prob2_a
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int x=num,sum=0;
		int digit=(int)Math.log10(num)+1;
		while(x!=0){
		    int rem=x%10;
		    sum+=rem*(Math.pow(10,digit-1));
		    digit--;
		    x/=10;
		}


		if(num==sum){
		    System.out.println("Number is Palindrome");

		}
		else
		    System.out.println("Number is not Palindrome");
	}
}

