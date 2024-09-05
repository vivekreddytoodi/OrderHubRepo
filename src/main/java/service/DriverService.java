package service;

import model.Driver;
import model.Order;

import java.util.List;

public interface DriverService  {
    List<Driver> registerDriver(List<Driver> drivers);

    List<Driver> getAllDrivers();

     Driver getDriverById(Long id);

    void deleteDriver(Long id);

    void updateDriverLocation(Long driverId, double latitude, double longitude);

    List<Order> findAvailableOrdersNearby(Long driverId, double radius);
}
