import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();
        numbers.add(0L);//Como estamos usando un tipo de dato Long en el ArrayList, para datos o numeros muy grandes, entonces debemos colocar la L al final del entero para convertirlo en tipo Long

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("Escribe un numero: ");
            long number = scanner.nextLong(); //Para leer un numero entero largo

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