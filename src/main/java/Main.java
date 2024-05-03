import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dynamic " + getFibonacciDynamic(50));
        System.out.println("Recursion " + getFibonacciRecursion(50));
        System.out.println("Iterator " + getFibonacciIter(50));


    }

    public static int getFibonacciRecursion(int index){   // O(n2), не єфективний, якщо використовувати великий індекс.
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return getFibonacciRecursion(index-1) + getFibonacciRecursion(index-2);
        }

    }

    public static int getFibonacciIter(int index) {     // O(n), час сбільшується с разом с індексом,
                                                        // єфективний по пам'яті, не зберігая проміжних результатів;
        int n1, n2, n3;
        if (index == 1 || index == 2) {
            return 1;
        } else if (index == 0) {
            return 0;
        } else {
            n1 = 1;
            n2 = 1;
            n3 = 0;

            for (int i = 2; i < index; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }

        }
        return n3;
    }


    public static int getFibonacciDynamic(int index) {   // О(n), час прямо залежить від индексу
        int result[] = new int[index];                     // займає більше пам'яті, так як використвуємо масив, і зберігаємо проміжні резултати;
        int j = 1;
        if (index == 1) {
            return 1;
        } else if (index == 0) {
            return 0;
        } else {
            for (int i = 1; i < index; i++) {
                result[i] = j;
                j = result[i - 1] + j;
            }
            System.out.println(Arrays.toString(result));
            return j;
        }
    }
}
