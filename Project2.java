// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Project2 {
    public static void main(String[] args) throws IOException {

        int[] array = { 12, 8, 7, 12, 33, 13, 34 };
        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int max;
        Logger logger = Logger.getLogger(Project2.class.getName());
        FileHandler info = new FileHandler("log.txt");
        logger.addHandler(info);
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    max = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = max;
                }
            }

            logger.info(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}