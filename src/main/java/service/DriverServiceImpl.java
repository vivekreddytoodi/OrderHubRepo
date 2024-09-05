package service;

import model.Driver;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import repository.DriverRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> registerDriver(List<Driver> drivers) {
        return StreamSupport.stream(driverRepository.saveAll(drivers).spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Driver> getAllDrivers() {
        return null;
    }

    @Override
    public Driver getDriverById(Long id) {
        return null;
    }

    @Override
    public void deleteDriver(Long id) {

    }

    @Override
    public void updateDriverLocation(Long driverId, double latitude, double longitude) {

    }

    @Override
    public List<Order> findAvailableOrdersNearby(Long driverId, double radius) {
        return null;
    }
}
