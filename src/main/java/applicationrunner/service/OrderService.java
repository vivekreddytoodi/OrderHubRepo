package applicationrunner.service;

import applicationrunner.model.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface OrderService {

    Order assignOrderToDriver(Long orderId, Long driverId);

    Optional<Order> getOrderDetails(Long orderId);

    void updateOrderStatus(Long orderId, String status);
}
