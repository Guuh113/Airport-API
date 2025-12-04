package br.com.gustavo.airports.repositories;

import br.com.gustavo.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DIT2A
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {

    List<Airport> findByCityIgnoreCase(String city);

    List<Airport> findByCountryIgnoreCase(String country);
  
    Airport findByIataCode(String iataCode);
}
