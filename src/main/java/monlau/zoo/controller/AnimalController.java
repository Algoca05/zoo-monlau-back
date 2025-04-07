package monlau.zoo.controller;

import lombok.RequiredArgsConstructor;
import monlau.zoo.dto.AnimalWithCuidadorIdDTO;
import monlau.zoo.model.Animal;
import monlau.zoo.model.Cuidador;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PutMapping("/animales/cuidados/{id}")
    public ResponseEntity<?> cuidarAnimal(@RequestBody Animal animal, @PathVariable Integer id) {
        try {
            Animal animalExistente = animalServicio.obtenerAnimalPorId(id);
            animalExistente.setSalud(100);//lo establecemos como 100 directamente ya que es la salud maxima del animal y se usara para hacer cuidados
            animalServicio.guardarAnimal(animalExistente);
            return new ResponseEntity<>(animal, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
