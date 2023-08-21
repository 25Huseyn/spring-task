package az.atlacademy.springbootmeeting.service;

import az.atlacademy.springbootmeeting.dto.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsCRUDService extends JpaRepository<Cars, Long>{

}
