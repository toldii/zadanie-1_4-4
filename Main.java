import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("podaj licznik");
    double a = scan.nextInt();
       System.out.println("podaj mianownik");
    double b = scan.nextInt();
    double wynik = a/b;
    if (b == 0)
      System.out.println("Nie dziel przez 0");
    else
    System.out.println("Wynik dzielenia to: " +  wynik);

  }
}