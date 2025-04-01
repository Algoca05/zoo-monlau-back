package controller;

import lombok.RequiredArgsConstructor;
import model.Animal;
import org.springframework.web.bind.annotation.RestController;
import servicio.AnimalServicio;

@RestController
@RequiredArgsConstructor

public class Animal {
    private final AnimalServicio animalServicio;
}
