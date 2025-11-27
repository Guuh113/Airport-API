package br.com.gustavo.airports.service;

import br.com.gustavo.airports.entities.Airport;
import br.com.gustavo.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIT2A
 */
@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> findAll() {
        List<Airport> result = airportRepository.findAll();
        return result;
    }
    public List<Airport> findByCity(String city){
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
                
    }
}
