package az.atlacademy.springbootmeeting.controllers;

import az.atlacademy.springbootmeeting.dto.Cars;
import az.atlacademy.springbootmeeting.service.CarsCRUDService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarsController {

    private final CarsCRUDService carService;


    public CarsController(CarsCRUDService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAll")
    public List<Cars> getAllCars() {
        return carService.findAll();
    }

    @PostMapping("/createAll")
    public Cars createCars(@RequestBody Cars request) {
        return carService.save(request);
    }

    @GetMapping("/getById/{id}")
    public Optional<Cars> getCarsById(@PathVariable @NotBlank Long id) {
        return carService.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteCars(@PathVariable @NotBlank Long id) {
        this.carService.deleteById(id);
    }

    @PutMapping("/putById/{id}")
    public Cars putCars(@PathVariable @NotBlank Long id, @RequestBody Cars request) {
        Cars existingCars = carService.findById(id).orElse(null);
        if (existingCars == null){
            return null;
        }
        existingCars.setName(request.getName());
        existingCars.setBrend(request.getBrend());
        existingCars.setSerial_number(request.getSerial_number());
        existingCars.setPower(request.getPower());
        existingCars.setStatus(request.getStatus());
        return carService.save(existingCars);
    }
}
