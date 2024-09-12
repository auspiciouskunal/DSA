import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(isPrime(num)){
            System.out.println("Number "+num+" is prime Number.");
        }else{
            System.out.println("Not a prime number");
        }
        printPrimes(10,20);
    }

    public static Boolean isPrime(int num){
        if(num==2 || num==3){
            return true;
        }else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrimes(int num1, int num2){

        for(int i=num1; i<=num2 ;i++){
//            boolean flag = true;
//            for(int j=2; j<i;j++){
//                if(i%j==0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println(i + " is a prime number");
//            }
            if(isPrime(i)){
                System.out.println(i + " is Prime number");
            }


        }
    }
}
