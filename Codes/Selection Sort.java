public class SelectionSort {

    public static void selectionSort(int[] arr) {
        // Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            // Предполагаем, что первый элемент в неотсортированной части - минимальный
            int minIndex = i;

            // Ищем минимальный элемент в оставшейся части массива
            for (int j = i + 1; j < arr.length; j++) {
                // Сравниваем текущий элемент с предполагаемым минимумом
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Обновляем индекс минимального элемента
                }
            }

            // Меняем найденный минимальный элемент с первым элементом в неотсортированной части
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        // Создаем тестовый массив
        int[] testArray = {64, 25, 12, 22, 11};
        
        System.out.print("Исходный массив: ");
        printArray(testArray);
        
        // Сортируем массив
        selectionSort(testArray);
        
        System.out.print("Отсортированный массив: ");
        printArray(testArray);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
