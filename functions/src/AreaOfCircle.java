import java.util.Scanner;

/*
Problem Description
You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.

Note :

The formula for the area of a circle is Area = πr², where r is the radius of the circle.
You can use the value of PI as 3.1416
Round up the final answer up to 2 decimal places.
You can use round(area, 2) it for rounding area to 2 decimal places


Problem Constraints
1 <= A <= 1000


Input Format
First and only argument is an integer A.


Output Format
Return final answer upto 2 decimal places, denoting the area of the circle.


Example Input

Input 1:

8

Input 2:

15



Example Output

Output 1:

201.06

Output 2:

706.86



Example Explanation
Explanation 1:

r = 8Area = πr²     = 3.1416 * 8 * 8     = 201.0604     = 201.06 (upto 2 decimal places)

Explanation 2:

r = 8Area = πr²     = 3.1416 * 15 * 15     = 706.86
 */
public class AreaOfCircle {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        System.out.format("%.2f",areaOfCircle(radius));
    }

    public static double areaOfCircle(int radius){
        double PI = 3.1416;
        double area = PI * radius*radius;

        return area;
    }
}
