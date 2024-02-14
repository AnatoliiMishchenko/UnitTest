package task_5.intergration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    PaymentService mocKPaymentService;
    OrderService orderService;

    @BeforeEach
    void setUp(){
        mocKPaymentService = Mockito.mock(PaymentService.class);
        orderService = new OrderService(mocKPaymentService);

    }

    @Test
    void placeOrder() {
        orderService.placeOrder("first",34.3);
        Mockito.verify(mocKPaymentService, Mockito.times(1)).
                processPayment("first",34.3);

    }
}