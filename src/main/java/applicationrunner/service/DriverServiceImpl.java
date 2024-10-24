package applicationrunner.service;

import applicationrunner.model.Driver;
import applicationrunner.model.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import applicationrunner.repository.DriverRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Inject PasswordEncoder

    @Override
    @Transactional
    public List<Driver> registerDriver(List<Driver> drivers) {
        for (Driver driver : drivers) {
            String encodedPassword = passwordEncoder.encode(driver.getPassword());
            System.out.println("Encoded Password: " + encodedPassword);
            driver.setPassword(encodedPassword);

        }
        return new ArrayList<>(driverRepository.saveAll(drivers));
    }

    @Override
    public Driver getDriverByUsername(String username) {
        return driverRepository.findByUserName(username)
                .orElseThrow(() -> new RuntimeException("Driver not found with username: " + username));
    }

    @Override
    public List<Driver> getAllDrivers() {
        return new ArrayList<>(driverRepository.findAll());
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElseThrow(() -> new RuntimeException("Driver not found"));
    }


    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);

    }

    @Override
    public void updateDriverLocation(Long driverId, double latitude, double longitude) {
        Driver driver = driverRepository.findById(driverId)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setLatitude(latitude);
        driver.setLongitude(longitude);
        driverRepository.save(driver);

    }

    @Override
    public String driverStatus(String status) {
        return "status";
    }

    @Override
    public List<Order> findAvailableOrdersNearby(Long driverId, double radius) {
        return new ArrayList<>(); // Placeholder
    }
}
