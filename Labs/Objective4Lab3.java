import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear, order = 0;

    birthYear = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");
    age = input.nextInt();
    System.out.println("What year is it?");
    currentYear = input.nextInt();

    while( order != 1 && order != 2){

      System.out.println("If your birthday is today, or your birthday this year has already passed, press 1. \nIf your birthday is still coming up, press 2.");
      order = input.nextInt();

      if(order == 1){
        birthYear = currentYear - age;
      } else if (order == 2 ){
        birthYear = currentYear - age - 1;
      }
    }

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
