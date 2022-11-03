import java.util.Scanner;

public class Asterix {
    public static void main(String[] args) {

        // First level
        double normalPotionBrewTime = 5;
        double asterixPotionBrewTime = 3;
        double obelixPotionBrewTime = asterixPotionBrewTime / 2;
        boolean completedPotion = asterixPotionBrewTime + obelixPotionBrewTime > normalPotionBrewTime;

        System.out.println(completedPotion);

        // Second level
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое натуральное число для определения его чётности:");
        int inputNumber = scanner.nextInt();
        int remainder = inputNumber % 2;
        boolean evenNumber = remainder == 0;

        System.out.println(evenNumber);
    }
}