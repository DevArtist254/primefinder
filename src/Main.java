import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean appInit = true;

        do {
            try {
                System.out.println("Find all prime numbers when you enter value A and B");
                System.out.println("Enter value A number");
                int A = Integer.parseInt(sc.nextLine());

                System.out.println("Enter value B number");
                int B = Integer.parseInt(sc.nextLine());

                if (A > B) {
                        for(int i = B; A >= i; i++ ){
                            System.out.println(i + " is" + (isPrime(i) ? " not" : "") + " a prime number");
                            appInit = false;
                        }
                } else if (B > A) {
                        for(int i = A; B >= i; i++ ){
                            System.out.println(i + " is" + (isPrime(i) ? " not" : "") + " a prime number");
                            appInit = false;
                        }
                } else if (A == B) {

                    System.out.println(A + " is" + (isPrime(A) ? " not" : "") + " a prime number");
                    appInit = false;
                }

            }catch (NumberFormatException e){
                System.out.println("Please enter a whole number");
            }
        }while (appInit);

    }

    public static boolean isPrime(int wholeNumber){
        if( wholeNumber < 2) return wholeNumber % 2 == 0;

        for(int i = 2;wholeNumber > i; i++){

            if(wholeNumber % i == 0) return true;
        }

        return false;
    }
}