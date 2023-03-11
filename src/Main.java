import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 по теме массивы ");
        int[] weight = new int[]{1, 2, 3};
        float[] second = {1.57f, 7, 654f, 9, 986f};
        int[] bidBox = {5, 6, 12};
    }

    public static void task2() {
        System.out.println("Задача 2 по теме массивы");
        // Вывод первого массива беззапятой в конце.
        int[] first = new int[]{1, 2, 3};
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        float[] second = {1.57f, 7.654f, 9.986f};
        second[0] = 1.57f;
        second[1] = 7.654f;
        second[2] = 9.986f;
        System.out.println(second[0]);
        System.out.println(second[1]);
        System.out.println(second[2]);
    }

    public static void task3() {
        System.out.println("Задача 3 по теме массивы ");
        int[] first = new int[]{3, 2, 1};
        first[0] = 3;
        first[1] = 2;
        first[2] = 1;
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        float[] second = {9.986f, 7.654f, 1.57f};
        second[0] = 9.986f;
        second[1] = 7.654f;
        second[2] = 1.57f;
        System.out.println(second[0]);// Или можно было бы тут поменять значения second,
        // чтобы не менять все цифры местми. Так же это относиться к first
        System.out.println(second[1]);
        System.out.println(second[2]);
    }

    public static void task4() {
        System.out.println("Задача 4 по теме массивы ");

        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 1;
                System.out.println("\n " + Arrays.toString(arr));
            }
        }
    }
}