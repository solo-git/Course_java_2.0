import java.util.Arrays;
import java.util.Random;

/**
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 * @author Salomatin A.E.
 * @see #main(String[])
 * @see #arryaFill()
 * @see #arryaOut()
 * @see #minValue()
 * @see #maxValue()
 */

public class Task_04_1 {
    static Random random = new Random();
    static int i, arr[] = new int[20], dl = arr.length;

    public static void main(String[] args) {
        int max, min;

        arryaFill();
        arryaOut();
        max = maxValue();
        min = minValue();
        arr[max]= arr[max]+arr[min]-(arr[min]= arr[max]);
        arryaOut();
    }

    // Заполнение массива случайными целыми числами от -10 до 10
    public static void arryaFill() {
        for (i = 0; i < dl; i++) {
            arr[i] = random.nextInt(21) - 10;
        }
    }

    // Вывод массива на консоль
    public static void arryaOut() {
        System.out.println(Arrays.toString(arr));
    }

    // Поиск индекса минимального положительного элемента массива
    public static int minValue() {
        int minIndex = -1;

        for (i = 0; i < dl; i++) {
            if (arr[i] > 0) {
                if (minIndex == -1 || arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    // Поиск индекса максимального отрицательного элемента массива
    public static int maxValue() {
        int maxIndex = -1;

        for (i = 0; i < dl; i++) {
            if (arr[i] < 0) {
                if (maxIndex == -1 || arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

}

