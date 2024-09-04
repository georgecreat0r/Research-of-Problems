import java.util.Scanner;
import java.util.Set;

public class ConsoleInputOutput {

    private final Scanner scanner = new Scanner(System.in);

    public int checkInput2() {
        int res = readInt();

        while (res < 1 || res > 3) {
            System.out.println("Введите число из указанных выше.");
            res = readInt();
        }

        return res;
    }

    private int readInt() { // метод для считывания числа с возможностью выхода через нажатие q
        String input; // для считывания с консоли строки, чтобы проверить, является ли q (для возможности выхода)
        int number; // для преобразования строки в число

        while (true) { // цикл длится пока нет ввода целого числа или q
            System.out.print("Введите число: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) { // проверка является ли строка q для возможного выхода
                scanner.close();
                System.out.println("Ждём Вас снова.");
                System.exit(0); // выход из программы
            }

            try {
                number = Integer.parseInt(input); // попытка преобразование строки в число
                return number;
            } catch (NumberFormatException e) { // обработка неправильного ввода
                System.out.println("Неправильный ввод. Пожалуйста введите целое число. Если желайте выйти - нажмите q.");
            }
        }
    }

    public void print(Set<Laptop> laptops) {
        System.out.println();
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
