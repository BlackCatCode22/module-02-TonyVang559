import java.util.Scanner;

public class HowToReverseStrings {
    public static void main(String[] args) {

        //Creat a program that prompts the user to enter a string using Java’s Scanner class
        Scanner sc = new Scanner(System.in);
        String rev = "";

        //Prompts the user to input a word or sentence
        System.out.println("\n" + "Enter a word or sentence to reverse it");
        rev = sc.nextLine();

        //My String variable
        String reverse = "";

        for(int i =rev.length()-1; i>=0; i--)

        {
            reverse = reverse + rev.charAt(i);
        }
            //The output of the reverse word/sentence
            System.out.println("\n" + "My reversed string in backward form is : " + reverse);

     }

}

