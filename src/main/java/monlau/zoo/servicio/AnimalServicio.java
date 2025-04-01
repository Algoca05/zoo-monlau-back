package servicio;


import model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.AnimalRepositorio;

import java.util.List;

@Service
public class AnimalServicio {
    @Autowired
    private AnimalRepositorio animalRepositorio;
    public List<Animal>listarAnimales() {
        return animalRepositorio.findAll();
    }
}
