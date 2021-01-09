public class SkillDistilleryMethods {
  public static void main(String[] args) {

    System.out.println("A square:\n");
    printSquare();
    System.out.println();

    System.out.println("A rectangle:\n");
    printRectangle();
  }

  private static void printSquare() {
    for (int i = 0 ;  i < 10 ; i++){
      System.out.println("XXXXXXXXXXXXXXXXXXXX");
    }
  }

  private static void printRectangle() {
    printSquare();
    printSquare();
  }
}
