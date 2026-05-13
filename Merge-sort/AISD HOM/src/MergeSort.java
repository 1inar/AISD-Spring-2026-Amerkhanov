public class MergeSort {

     public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90, 5, 77, 30, 3000};

        System.out.println("Исходный массив:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Метод слияния двух отсортированных подмассивов
    public static void merge(int[] array, int left, int middle, int right) {
        // Размеры временных массивов
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        // Создаем временные массивы
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Копируем данные во временные массивы
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Индексы для прохода по временным массивам
        int i = 0, j = 0;
        // Индекс для вставки в исходный массив
        int k = left;

        // Слияние: сравниваем элементы из левого и правого массивов
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы из левого массива (если есть)
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы из правого массива (если есть)
        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Находим средний индекс
            int middle = left + (right - left) / 2;

            // Рекурсивно сортируем левую половину
            mergeSort(array, left, middle);

            // Рекурсивно сортируем правую половину
            mergeSort(array, middle + 1, right);

            // Сливаем отсортиркованные половины
            merge(array, left, middle, right);
        }
    }

    // Вспомогательный метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
