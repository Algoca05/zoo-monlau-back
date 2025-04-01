package controller;

import lombok.RequiredArgsConstructor;
import model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.AnimalServicio;

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
