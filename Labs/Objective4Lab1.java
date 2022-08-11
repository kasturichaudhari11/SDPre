import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    //TODO prompt the user to get input for all of the String variables.

    System.out.println("What is your first name?");
    String fnameInput = input.nextLine();
    System.out.println("What is your last name?");
    String lnameInput = input.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimalInput = input.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFoodnput = input.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSongInput = input.nextLine();

    //TODO print the output formatted to look like the expected output using String concatenation.

    System.out.println("My name is " + fnameInput + " " + lnameInput + ".");
    System.out.println("My favorite animal is " + favoriteAnimalInput + ".");
    System.out.println("My favorite food is " + favoriteFoodnput + ".");
    System.out.println("My favorite song is " + favoriteSongInput + ".");

  }
}
