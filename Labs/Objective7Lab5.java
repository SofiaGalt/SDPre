import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {

      printMenu();

      selection = scanner.nextInt();

      if( executeMenuSelection(selection) == 1 ) break;
    }

    scanner.close();
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static int executeMenuSelection( int selection ) {

    switch(selection){
      case 1:
        System.out.println("Hello World");
        break;
      case 2:
        System.out.println("Apple, Banana, Coconut");
        break;
      case 3:
        System.out.println("Goodbye");
        return 1;
      default:
        System.out.println(selection + " is not a recognized menu option");
    }

    return 0;
  }

}
