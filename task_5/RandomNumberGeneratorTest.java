package task_5;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomNumberGeneratorTest {
    @Test
    public void testGenerateNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();//создается класс генератор
        List<Integer> numbers = generator.generateNumbers(10);// список сгенерированых чисел из 10 штук

        assertNotNull(numbers);// проверяется не пустое число в списке
        assertEquals(10, numbers.size());// список состаит из 10 элементов
    }
}