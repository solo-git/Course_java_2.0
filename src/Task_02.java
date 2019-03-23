import java.util.Scanner; // Импорт класса Scanner

/**
 * 1. Начинаем писать калькулятор:
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода.
 * Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 * 2. Запушить проект в свой репозиторий на GitHub
 * *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 * @author Salomatin A.E.
 * @see #main(String[])
 */

public class Task_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Объявление переменных
        double a, b, res;

        // Цикл на проверку корректно введенной операции
        while (true) {
            System.out.print("Введите математическую операцию символом(+,-,*,/): ");
            String op = scan.next();

            // Осуществляется проверка, что введена математическая операция
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

                // Ввод дробных чисел с консоли
                while (true){
                    System.out.print("Введите первое число: ");
                    if (scan.hasNextDouble()) {
                        a = scan.nextDouble();
                        break;
                    } else {
                        System.out.println("Допускается только ввод чисел типа double. Попробуйте еще раз.");
                        scan.next();
                    }
                }
                while (true){
                    System.out.print("Введите второе число: ");
                    if (scan.hasNextDouble()) {
                        b = scan.nextDouble();
                        break;
                    } else {
                        System.out.println("Допускается только ввод чисел типа double. Попробуйте еще раз.");
                        scan.next();
                    }
                }

                // Осуществление математической операции в зависимости от знака
                switch (op) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    default:
                        res = a / b;
                }

                // Вывод форматированного результата в консоль
                System.out.printf("Результат " + a + " " + op + " " + b + " = %.4f \n", res);

                break; // Прекращает выполнение цикла
            } else {
                System.out.println("Вы ввели не математическую операцию. Попробуйте еще раз.");
            }
        }
    }
}
