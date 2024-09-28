package applicationrunner.repository;

import applicationrunner.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    // Find  drivers by their  status
/*    @Query
    List<Driver> findByIsActive(boolean isActive){

    };*/

}
