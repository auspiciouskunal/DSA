import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Absolute value for "+ num +" is: "+absoluteValue(num));
    }
    public static int absoluteValue(int num){
        if(num<0){
            return num*-1;
        }
        return num;
    }
}