import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private Car car;

    /**
    проверка того, что экземпляр объекта Car также является экземпляром
             транспортного средства; (instanceof)
     */
    @Test
    public void testCar() {
        car = new Car("fds", "fss", 4, 4, 0);
        assertInstanceOf(car, car);
    }

    private void assertInstanceOf(Car car, Car car1) {
    }

    /**
     * проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    public void testnumberWheels(){

        assertEquals(4,car.getNumWheels());
    }
    /**
     * проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */

    @Test
    public void testSpeedTestDrive(){
        assertEquals(60,car.testDrive());
    }
    /**
     * проверить, что в режиме парковки (сначала testDrive, потом park, т.е
     *               эмуляция движения транспорта) машина останавливается (speed = 0)
     */

    @Test
    public void  testParc(){
        assertEquals(0,car.park());
    }

}
