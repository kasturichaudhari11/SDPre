import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.println("Please enter the first whole number you would like to add. ");
    int num1Input = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add. ");
    int num2Input = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add. ");
    int num3Input = keyboard.nextInt();

    //TODO prompt the user to get input for all of the above double variables.
    System.out.println("Please enter the first decimal number you would like to add.");
    double decimalnum1Input = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double decimalnum2Input = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    double decimalnum3Input = keyboard.nextDouble();

    //TODO print the three ints and their sum.
    int sum1 = num1Input + num2Input + num3Input;
    System.out.println("The sum of " + num1Input + " + " + num2Input + " + " + num3Input + " = " + sum1);

    //TODO print the three doubles and their sum.
    double sum2 = decimalnum1Input + decimalnum2Input + decimalnum3Input;
    System.out.println("The sum of " + decimalnum1Input + " + " + decimalnum2Input + " + " + decimalnum3Input + " = " + sum2);

  }
}
