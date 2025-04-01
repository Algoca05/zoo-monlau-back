package monlau.zoo.controller;

import lombok.RequiredArgsConstructor;
import monlau.zoo.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import monlau.zoo.servicio.AnimalServicio;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AnimalController {
    private final AnimalServicio animalServicio;

    @GetMapping("/animales")
    public List<Animal> listarProductos() {
        return animalServicio.listarAnimales();
    }

}
