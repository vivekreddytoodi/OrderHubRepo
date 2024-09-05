package repository;

import model.Driver;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public interface DriverRepository extends JpaRepository<Driver, Long> {

    // Find  drivers by their  status
/*    @Query
    List<Driver> findByIsActive(boolean isActive){

    };*/

}
