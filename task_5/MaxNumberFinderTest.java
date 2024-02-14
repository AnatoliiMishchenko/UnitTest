package task_5;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxNumberFinderTest {
    @Test
    public void testFindMax() {
        MaxNumberFinder finder = new MaxNumberFinder();// инициализируем класс
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 6, 8);// создаем список заполненых элементов

        int max = finder.findMax(numbers);//находим максимальный элемент

        assertEquals(9, max);// проверяем максимальный элемент равен 9
    }

    @Test
    public void testFindMaxEmptyList() {
        MaxNumberFinder finder = new MaxNumberFinder();// созлаем класс finder
        List<Integer> emptyList = Arrays.asList();// создаем список пустой лист

        assertThrows(IllegalArgumentException.class, () -> finder.findMax(emptyList));// проверем ошибку пустога списка
    }
}