import java.util.Scanner;

/**
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.
 * Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 * @author Salomatin A.E.
 * @see #main(String[])
 * @see #maxElement()
 */

public class Task_03 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Выбор осуществляемой операции
        System.out.print("Введите номер операции (1 - запуск выполнения калькулятора; 2 - поиск максимального слова в массиве): ");
        String oper = scan.next();
        switch (oper) {
            case "1":
                Task_02 calculator = new Task_02();
                calculator.main(args); // Запуск выполннения калькулятора из класса Task_02
                break;
            case "2":
                maxElement(); // Запуск поиска максимального элемента в массиве
                break;
            default:
                System.out.println("Ошибка ввода номера операции. Попробуйте еще раз.");
                main(args);
        }
    }

    public static void maxElement() {
        int i, dl;

        // Осуществляем ввод длины массива
        while (true) {
            System.out.print("Введите длину массива: ");
            if (scan.hasNextInt()){
                dl = scan.nextInt();
                break;
            } else {
                System.out.println("Допускается только ввод чисел типа int. Попробуйте еще раз.");
                scan.next();
            }
        }

        // Осуществляем заполнение массива
        String mas[] = new String[dl];
        System.out.println("Задайте массив слов.");
        for (i = 0; i < dl; i++) {
            System.out.print("Введите элемент[" + i + "]: ");
            mas[i] = scan.next();
        }

        // Поиск слова максимальной длины из массива
        String n, m = mas[0];

        for (i = 1; i < dl; i++) {
            n = mas[i];
            if (n.length() > m.length()) {
                m = mas[i];
            }
        }
        System.out.println("Самое длинное слово в массиве: " + m + " (его длинна составляет " + m.length() + " символов).");

    }
}
