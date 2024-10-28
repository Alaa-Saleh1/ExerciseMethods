import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Ex1 - Write a Java method to find the smallest number among three
numbers.*/

//        System.out.println("Please enter first number: ");
//        double number1 = input.nextDouble();
//        System.out.println("Please enter second number: ");
//        double number2 = input.nextDouble();
//        System.out.println("Please enter third number: ");
//        double number3 = input.nextDouble();
//
//        System.out.println("The smallest value is "+smallest(number1,number2,number3));




        /*Ex2 - Write a Java method that check if the entered number is negative or
positive or zero. */

//        System.out.println("Please enter number: ");
//        int number= input.nextInt();
//        checkNumber(number);



        /*Ex3 - Write a Java method to check whether a string is a valid password. */
//
//        System.out.print("1. A password must have at least eight characters.                                          \n" +
//                "2. A password consists of only letters and digits.                                          \n" +
//                "3. A password must contain at least two digits                                         \n" +
//                "Input a password (You are agreeing to the above Terms and Conditions): ");
//        String password = input.nextLine();
//        if (isValidPassword(password)) {
//            System.out.println(password+" Is valid.");
//        } else {
//            System.out.println(password+ " Is invalid.");
//        }


    }

    public static boolean isValidPassword(String password){
            if (password.length() < 8) {
                return false;
            }

            int count = 0;
            boolean letterValue = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                count++;
            }
            if (Character.isLetter(c)){
                letterValue =true;
            }
        }
            return count >= 2 && letterValue ;
    }



    public static void checkNumber(int num){
        if(num > 0){
            System.out.println(num+" is positive.");
        } else if (num < 0) {
            System.out.println(num+" is negative.");
        }else System.out.println("Zero.");
    }



    public static double smallest(double num1 , double num2, double num3 ){
        double min=num1;
        if(num2<num1)
            min=num2;
        if(num3<num1)
            min=num3;
        return min ;
    }
}