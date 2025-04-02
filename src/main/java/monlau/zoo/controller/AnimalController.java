package monlau.zoo.controller;

import lombok.RequiredArgsConstructor;
import monlau.zoo.dto.AnimalWithCuidadorIdDTO;
import monlau.zoo.model.Animal;
import org.springframework.web.bind.annotation.*;
import monlau.zoo.servicio.AnimalServicio;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AnimalController {
    private final AnimalServicio animalServicio;

    @GetMapping("/animales")
    public List<AnimalWithCuidadorIdDTO> listarAnimales() {
        return animalServicio.listarAnimales();
    }

    @PostMapping("/animales")
    public void nuevoAnimal(@RequestBody Animal animal) {
        animalServicio.guardarAnimal(animal);
    }

    @DeleteMapping("/animales/{id}")
    public void borrarAnimal(@PathVariable Integer id) {
        animalServicio.eliminarAnimal(id);
    }
}
