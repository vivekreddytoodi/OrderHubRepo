package applicationrunner.service;

import applicationrunner.model.Driver;
import applicationrunner.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DriverService  {
    List<Driver> registerDriver(List<Driver> drivers);

    Driver getDriverByUsername(String username);

    List<Driver> getAllDrivers();

     Driver getDriverById(Long id);

    void deleteDriver(Long id);

    void updateDriverLocation(Long driverId, double latitude, double longitude);

    String driverStatus(String status);

    List<Order> findAvailableOrdersNearby(Long driverId, double radius);
}
