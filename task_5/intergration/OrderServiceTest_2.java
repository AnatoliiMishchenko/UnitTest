package task_5.intergration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest_2 {
    PaymentService mockPaymentService;
    OrderService orderService;

    @BeforeEach
    void  setUp(){
        mockPaymentService = new PaymentService();
        orderService = new OrderService(mockPaymentService);
    }
    @Test
    void placeOrder(){
        Assertions.assertTrue(orderService.placeOrder("1", 32));
    }
}
