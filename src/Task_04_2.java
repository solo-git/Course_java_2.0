import java.util.Scanner;
import present.Candy;
import present.Biscuit;
import present.Marmalade;
import present.Sweets;

/**
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc).
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 *
 * @author Salomatin A.E.
 */
public class Task_04_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean a = true;
        double sumPrice =0;
        int q1, q2, q3, q4, q5, sumWeight, count;
        q1 = q2 = q3 = q4 = q5 = sumWeight = count = 0;


        Candy candy1 = new Candy("Конфета Белочка", 5, 2, 0, "Бабаевский");
        Candy candy2 = new Candy("Конфета Аленка", 4, 1.5, 0, "Красный октябрь");
        Marmalade marmalade1 = new Marmalade("Мармелад Лимонные дольки", 250, 126, 0, 10);
        Marmalade marmalade2 = new Marmalade("Мармелад Нева Трехслойный", 200, 110.90, 0, 8);
        Biscuit biscuit1 = new Biscuit("Печенье Юбилейное", 112, 31.80, 0, "Песочное");
        Sweets[] box = {candy1, candy2, marmalade1, marmalade2, biscuit1};

        System.out.println("Введите номер сладости для добавления в подарок: ");
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(" " + count + " - " + box[i].getName());
        }
        System.out.println(" 0 - Завершить формирование подарка.\n");

        while (a) {
            String num = scan.next();
            switch (num) {
            case "1":
                    q1++;
                    candy1.setQuantity(q1);
                    sumWeight += candy1.getWeight();
                    sumPrice += candy1.getPrice();
                    System.out.println(candy1.getName() + " добавлена в подарок");
                    break;
                case "2":
                    q2++;
                    candy2.setQuantity(q2);
                    sumWeight += candy2.getWeight();
                    sumPrice += candy2.getPrice();
                    System.out.println(candy2.getName() + " добавлена в подарок");
                    break;
                case "3":
                    q3++;
                    marmalade1.setQuantity(q3);
                    sumWeight += marmalade1.getWeight();
                    sumPrice += marmalade1.getPrice();
                    System.out.println(marmalade1.getName() + " добавлен в подарок");
                    break;
                case "4":
                    q4++;
                    marmalade2.setQuantity(q4);
                    sumWeight += marmalade2.getWeight();
                    sumPrice += marmalade2.getPrice();
                    System.out.println(marmalade2.getName() + " добавлен в подарок");
                    break;
                case "5":
                    q5++;
                    biscuit1.setQuantity(q5);
                    sumWeight += biscuit1.getWeight();
                    sumPrice += biscuit1.getPrice();
                    System.out.println(biscuit1.getName() + " добавлено в подарок");
                    break;
                case "0":
                    System.out.println("Формирование подарка завершено.");
                    a = false;
                    break;
            }
        }

        System.out.println("\nСостав подарка: ");
        count =0;
        for (int i = 0; i < 5; i++) {
            if (box[i].getQuantity() > 0) {
                count++;
                System.out.println("  " + count + ". " + box[i].toString());
            }
        }
        System.out.println("Общий вес подарка " + sumWeight + " гр.");
        System.out.println("Общая цена подарка " + sumPrice + " руб.");


    }
}
