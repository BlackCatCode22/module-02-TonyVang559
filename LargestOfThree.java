import java.util.Scanner;

 public class LargestOfThree {
    public static void main(String[] args) {

        //Created a new object of Scanner and named it "largest" and stored it in the variable "largest"
        Scanner largest = new Scanner(System.in);

        //Prompts the user to enter the first number
        System.out.println("\n" + "Enter the first number");
        int x1 = largest.nextInt();

        //Prompts the user to enter the second number
        System.out.println("Enter the second number");
        int x2 = largest.nextInt();

        //Prompts the user to enter the third number
        System.out.println("Enter the third number");
        int x3 = largest.nextInt();

        //Prints output for x1 if it is greater than x2 or x3
        if (x1 > x2)
            if (x1 > x3)
                System.out.println("\n" + "The largest number among the three is: " + x1);

        //Prints output for x2 if it is greater than x1 or x3
        if (x2 > x1)
            if (x2 > x3)
                System.out.println("\n" + "The largest number among the three is: " + x2);

        //Prints output for x3 if it is greater than x1 or x2
        if (x3 > x1)
            if (x3 > x2)
                System.out.println("\n" + "The largest number among the three is: " + x3);

    }

}

