import java.util.Scanner;

public class UniqueNumber {

    // method to check the Unique number
    public static boolean isUnique(int number) {

        int n1 = number; //1st temporary variable
        int lastDigit = 0;
        int n2; //2nd temporary variable
        int count;

        // iterate through all digits of number
        while(n1 != 0) {

            // find last digits
            lastDigit = n1 % 10;

            // compare this digit with
            // all digits
            n2 = number;
            count = 0;

            // loop
            while(n2 != 0) {

                // find last digit
                // and compare
                if(lastDigit == n2%10)
                    count++;

                // remove last digit
                n2 /= 10;
            }

            if(count != 1)
                return false;

            // remove last digit
            n1 /= 10;
        }

        return true;
    }

    // main method
    public static void main(String[] args) {

        // declare variables
        int number = 0;
        boolean result = false;

        //create Scanner class object to take input
        Scanner scan = new Scanner(System.in);

        // take input from end-user
        System.out.print("Enter an integer number::");
        number = scan.nextInt();

        // check number is Unique number or not
        result = isUnique(number);

        // display
        if(result)
            System.out.println(number +
                    " is a Unique number.");
        else
            System.out.println(number +
                    " is not a Unique number.");

        // close Scanner class object
        scan.close();
    }
}