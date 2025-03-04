import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("Escribe un numero: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("El numero " + number + " es par, continuamos");
                numbers.add(number);
            } else {
                System.out.println("El numero " + number + " es impar, procedemos a salir");
                break;
            }
            numbers.add(number);
        }
    }
}