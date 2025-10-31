def binary_search(array, target):
    """
    Метод для выполнения бинарного поиска
    
    Args:
        array: отсортированный массив элементов
        target: искомый элемент
    
    Returns:
        индекс элемента или -1 если не найден
    """
    left = 0  # Левая граница поиска
    right = len(array) - 1  # Правая граница поиска

    while left <= right:
        # Находим середину массива
        mid = left + (right - left) // 2
        
        # Проверяем средний элемент
        if array[mid] == target:
            return mid  # Элемент найден

        # Если искомый элемент меньше среднего
        if array[mid] > target:
            right = mid - 1  # Перемещаемся влево
        else:
            left = mid + 1  # Перемещаемся вправо
    
    return -1  # Элемент не найден

# Основная функция для тестирования
if __name__ == "__main__":
    sorted_array = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    target = 7

    result = binary_search(sorted_array, target)

    if result != -1:
        print(f"Элемент найден на позиции: {result}")
    else:
        print("Элемент не найден")
