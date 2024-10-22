package applicationrunner.controller;
import lombok.RequiredArgsConstructor;
import applicationrunner.model.Driver;
import applicationrunner.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import applicationrunner.service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriverController {


    private final DriverService driverService;

    @GetMapping("/welcome")
    public String wecomePage(){
        return "Welcome to my app";

    }

    @PostMapping("/login")
    public String authenticateDriver(){
        return "Welcome to my app";

    }

    @PostMapping("/register")
    public ResponseEntity<List<Driver>> registerDrivers(@RequestBody List<Driver> drivers) {
        List<Driver> registeredDrivers = driverService.registerDriver(drivers);
        System.out.println("RegisterDrivers method called with: " + drivers);
        return ResponseEntity.ok(registeredDrivers);
    }

    @PutMapping("/{driverId}/location")
    public ResponseEntity<Void> updateDriverLocation(@PathVariable Long driverId,
                                                     @RequestParam double latitude,
                                                     @RequestParam double longitude) {
        driverService.updateDriverLocation(driverId, latitude, longitude);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{driverId}/orders/nearby")
    public ResponseEntity<List<Order>> getNearbyOrders(@PathVariable Long driverId,
                                                       @RequestParam double radius) {
        List<Order> nearbyOrders = driverService.findAvailableOrdersNearby(driverId, radius);
        return ResponseEntity.ok(nearbyOrders);
    }

}
