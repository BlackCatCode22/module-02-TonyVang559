import java.util.Scanner;

public class MadnessWithMethod {
    public static void main(String[] args) {

        //Using value 2 and value 3 as the name for the variable type "int"
        //Value assign for value 2 and value 3 is getAnIntFromTheUser
        int value2 = getAnIntFromTheUser();
        int value3 = getAnIntFromTheUser();

        int highestInteger = compareTwoInts(value2, value3);
        int sumOfNum = sumTwoInts(value2, value3);

        //Prints out the largest value of the two numbers inputted by the user
        System.out.println("\n" + "The largest of the two numbers entered is: " + highestInteger);

        //Prints out the sum total value of the two numbers inputted by the user
        System.out.println("\n" + "The sum of both two numbers entered is: " + sumOfNum);

    }

    public static int getAnIntFromTheUser() {

        //Prompts the user to enter an integer two times
        Scanner learner = new Scanner(System.in);
        System.out.println("\n" + "Enter a number here: ");

        int value = learner.nextInt();

        return value;

    }

    //Takes two integers as parameters and returns the largest of the two
    public static int compareTwoInts (int value2, int value3) {

        //Statement to execute if condition is true
        if (value2 > value3) {
            return value2;
        } {
            return value3;
        }
    }

    //Takes two integers as parameters and returns their sum
    public static int sumTwoInts(int value2, int value3) {

        //Return the sum of value2 + value3
        return value2 + value3;

    }
}






























