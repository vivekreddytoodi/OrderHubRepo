package applicationrunner.service;

import org.springframework.stereotype.Service;

@Service
public interface LocationService {
    double calculateDistance(double lat1, double lon1, double lat2, double lon2);
}
