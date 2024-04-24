//Aim - To write and implement a Menu driven program using switch case to perform the following operations:
// a. Display the addition result of 2 numbers
// b. Swapping of 2 numbers
// c. To check whether a number is prime or not

import java.util.Scanner;

public class Prg1 { 

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int ch = 0;

        System.out.println("Enter the number a: ");
        int a, b;
        a = sc.nextInt();
        System.out.println("Enter the number b: ");
        b = sc.nextInt();
        int i = 1;
        display();
        do{
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int sum = sum(a,b);
                    System.out.println("The sum of the 2 numbers is: "+ sum);
                    i = cont();
                    if (i==0) {
                        System.exit(0);
                    }
                    display();
                    break;
                case 2:
                    System.out.println("a = "+a+" b = "+b);
                    int c = a;
                    a = b;
                    b = c;
                    System.out.println("After Swapping :");
                    System.out.println("a = "+a+" b = "+b);
                    i = cont();
                    if (i==0) {
                        System.exit(0);
                    }
                    display();
                    break;
                case 3:
                    if(isPrime(a))
                        System.out.println("The number "+ a +" is Prime.");
                    else
                        System.out.println("The number "+ a +" is NOT Prime.");
                    if(isPrime(b))
                        System.out.println("The number "+ b +" is Prime.");
                    else
                        System.out.println("The number "+ b +" is NOT Prime.");
                        i = cont();
                    if (i==0) {
                        System.exit(0);
                    }
                    display();
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    System.exit(0);
                    break;
            }
        }while(i!=0);
       
    }

    static int sum(int a, int b){
        return a+b;
    }

    static boolean isPrime(int a){
        int count = 0;
        if(a<=1)
            return false;
        for(int i=1; i<=a; i++){
            if(a%i == 0)
                count++;
        }
        if (count>2) {
            return false;
        }
        return true;
    }   
    
    static void display(){
        System.out.println("Menu: ");
        System.out.println("1. Add a and b");
        System.out.println("2. Swap a and b");
        System.out.println("3. Check if a and b are prime");
    }

    static int cont(){
        System.out.println("Press 1 to continue or 0 to exit.");
        int i = sc.nextInt();
        return i;
    }
}
