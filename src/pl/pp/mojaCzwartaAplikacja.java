package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        /*
        //Zad 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dolny i górny limit: ");
        var num1 = scanner.nextInt();
        var num2 = scanner.nextInt();
        int sum=0;
        while(num1 != num2){
            for (var i = num1; i<=num2; i++){
                sum+=i*i;
            }
            System.out.println("Suma kwadratów od " + num1*num1 + " do " + num2*num2 + " wynosi " + sum);
            sum=0;
            System.out.println("Podaj następne limity: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
        System.out.println("Wyjście...");
        scanner.close();
         */

        //Zad 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj co chcesz zrobić\nDODAWANIE(1), ODEJMOWANIE(2), MNOŻENIE(3), DZIELENIE(4): ");
        var option = scanner.nextInt();
        while(option < 1 || option > 4) {
            System.out.println("Wybierz prawidłową opcję");
            option= scanner.nextInt();
        }

        if(option==1){
            System.out.println("Podaj x i y: ");
            var x = scanner.nextDouble();
            var y = scanner.nextDouble();
            System.out.println(x + " + " + y + " = " + (x+y));
        } else if (option==2) {
            System.out.println("Podaj x i y: ");
            var x = scanner.nextDouble();
            var y = scanner.nextDouble();
            System.out.println(x + " - " + y + " = " + (x-y));
        } else if (option==3) {
            System.out.println("Podaj x i y: ");
            var x = scanner.nextDouble();
            var y = scanner.nextDouble();
            System.out.println(x + " * " + y + " = " + (x*y));
        } else {
            System.out.println("Podaj x i y: ");
            var x = scanner.nextDouble();
            var y = scanner.nextDouble();
            System.out.println(x + " / " + y + " = " + (x/y));
        }

        System.out.println("Wyjście...");
        scanner.close();
    }
}
