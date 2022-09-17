/*Piyus Yadav
 * 20214091
 * CS3C
 */
/*Program to check whether a number is prime or not*/
import java.util.*;
public class prob1_e
{
    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);
	//Take Input of the number
        int num=sc.nextInt();
        int count=1,i=2;
	//Condition for if the number is 1 or not
        if(num!=1){
            while(i<num){
            if(num%i==0){
                count--;
                break;
            }
            i++;
	    }
	}
	else
		System.out.println("Not Prime Number:");
        if(count==1){
            	System.out.println("Prime Number");

        }
        else
            	System.out.println("Not Prime Number");
        
        
        
	}
}
/*Output:
 * 13
 * Prime Number
 */
