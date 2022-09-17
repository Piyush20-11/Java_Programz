/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to check whether a number is even or odd*/

import java.util.*;
public class prob1_d
{
	public static void main(String[] args) {
    		System.out.println("Enter the Number:");
    		Scanner sc=new Scanner(System.in);
		//Take the input of value to be check
    		int num=sc.nextInt();
		//Condition to check
    		if(num%2==0){
        	System.out.println("Number is Even");
        
    		}
   		else
    		System.out.println("Number is Odd");
	}
}
/*For input num=13, then Output is:
 * Enter the Number:
 * 13
 * Number is Odd
 */
