import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){

      Objective7Lab5.printMenu();
      selection = scanner.nextInt();
      if (Objective7Lab5.executeMenuSelection(selection) == 1) break;
    }

    scanner.close();
  }
}
