/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to display factors of number*/
import java.util.*;
public class prob2_c
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i,num=sc.nextInt();
		System.out.println("Factors of Number "+ num+":");
		for(i=1;i<=num;i++){
		    if(num%i==0)
		    System.out.println(i+" ");
		}
		
	}
}
/*
Output:
Enter the number
15
Factors of Number 15:
1
3
5
15
*/
