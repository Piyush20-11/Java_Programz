/*Piyush Yadav
 * 20214091
 * CS3C
 */
/*Program to find the area of circle*/


import java.util.*;
public class prob1_c
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Take the input for radius
            int radius=sc.nextInt();
            //Finding the area of Circle
            double Area=3.14*radius*radius;
                System.out.println("Area of Circle is:"+Area);//Output:For radius =7 is 153.86
        }
}

