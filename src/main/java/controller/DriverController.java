package controller;
//import com.orderhub.model.Driver;
//import com.orderhub.model.Order;
//import com.orderhub.service.DriverService;
import lombok.RequiredArgsConstructor;
import model.Driver;
import model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DriverService;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PostMapping("/register")
    public ResponseEntity<List<Driver>> registerDrivers(@RequestBody List<Driver> drivers) {
        List<Driver> registeredDrivers = driverService.registerDriver(drivers);
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
