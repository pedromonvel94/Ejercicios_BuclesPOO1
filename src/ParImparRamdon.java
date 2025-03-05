import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParImparRamdon {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(Integer.MAX_VALUE) + 1); // Generates a random positive integer
        }

        System.out.println("Generated numbers: " + numbers);

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("El numero " + number + " es par");
                evenCount++;
            } else {
                System.out.println("El numero " + number + " es impar");
                oddCount++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + evenCount);
        System.out.println("Cantidad de numeros impares: " + oddCount);
    }
}