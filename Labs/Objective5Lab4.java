import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int num;

    System.out.print("Enter a whole number to check whether it's even or odd: ");
    num = input.nextInt();

    if(num % 2 == 0){
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }

  }
}
