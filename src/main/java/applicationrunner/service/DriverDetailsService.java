package applicationrunner.service;

import applicationrunner.model.Driver;
import applicationrunner.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class DriverDetailsService implements UserDetailsService {


/*
    private final DriverRepository driverRepository;

//    @Autowired
//    public DriverDetailsService(DriverRepository driverRepository) {
//        this.driverRepository = driverRepository;
//    }*/
    private UserDetailsService userDetailsService;

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Driver driver = driverRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Driver not found with username: " + username));
        return new DriverDetails(driver);
    }
}
