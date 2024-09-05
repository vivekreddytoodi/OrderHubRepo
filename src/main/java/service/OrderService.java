package service;

import model.Order;

import java.util.Optional;

public interface OrderService {

    Order assignOrderToDriver(Long orderId, Long driverId);

    Optional<Order> getOrderDetails(Long orderId);

    void updateOrderStatus(Long orderId, String status);
}
