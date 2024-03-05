package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        //Pierwszy program
        int x = 10; //utworzenie zmiennej typu double i przypisanie jej wartości 10
        System.out.println("x = " +x+ "\ndwukrotność liczby x = "+ 2*x + "\nx^2 = " + x*x + "\n");

        //Drugi program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę swój wiek:");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("Twój wiek w sekundach: " + age*31556926);
    }
}