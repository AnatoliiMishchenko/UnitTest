import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {


    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp(){
        motorcycle = new Motorcycle("ff","dd",2);
    }

    /**
     * проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testnumberWheels(){
        Motorcycle motorcycle = new Motorcycle("ff", "dd", 1 );
        assertEquals(2,motorcycle.getNumWheels());
    }
    /**
     * проверка того, объект Motorcycle развивает скорость 75 в
     *              режиме тестового вождения (testDrive())
     */

    @Test
    public void testSpeedTestDraive(){
        assertEquals(75,motorcycle.testDrive());
    }
    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park  т.е
     *    эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    public void testParc(){
        assertEquals(0, motorcycle.testDrive());
    }
}
