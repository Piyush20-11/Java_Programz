/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to display the fibonacci Series*/


import java.util.*;
public class prob1_f
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t1=0,t2=1;
	    int n=sc.nextInt();
	    System.out.println(t1);
	    System.out.println(t2);
	    int sum=t1+t2;
	    //Loop to print the Fibonacci series
	    for(int i=2;i<=n;i++){
	        System.out.println(sum);
	        t1=t2;
	        t2=sum;
            
	        sum=t1+t2;
	        
	    }
	}
}
/*
 * Output:
9
0
1
1
2
3
5
8
13
21
34
*/ 

