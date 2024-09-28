package applicationrunner.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "drivers")
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Driver's name is required")
    private String name;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "Driver's license number is required")
    private String licenseNumber;

    @Column(nullable = false)
    @NotNull(message = "Latitude is required")
    private double latitude;

    @Column(nullable = false)
    @NotNull(message = "Longitude is required")
    private double longitude;

    @Column(nullable = false)
    @NotBlank(message = "Status is required")
    private String status;


    public Driver() {}


    public Driver(String name, String licenseNumber, double latitude, double longitude, String status) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", status='" + status + '\'' +
                '}';
    }
}
