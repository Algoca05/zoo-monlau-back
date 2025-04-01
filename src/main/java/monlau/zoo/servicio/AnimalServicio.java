package monlau.zoo.servicio;


import monlau.zoo.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monlau.zoo.repositorio.AnimalRepositorio;

import java.util.List;

@Service
public class AnimalServicio {
    @Autowired
    private AnimalRepositorio animalRepositorio;
    public List<Animal>listarAnimales() {
        return animalRepositorio.findAll();
    }
}
