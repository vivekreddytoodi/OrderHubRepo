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
public class Driver implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Driver's name is required")
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "Username is required")
    private String username;

    @Column(nullable = false)
    @NotBlank(message = "Roles are required")
    private String roles;

    @Column(nullable = false)
    @NotNull(message = "Password is required")
    private String password;


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

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
