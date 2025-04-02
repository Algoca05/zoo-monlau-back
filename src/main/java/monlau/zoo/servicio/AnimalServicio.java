package monlau.zoo.servicio;


import monlau.zoo.dto.AnimalWithCuidadorIdDTO;
import monlau.zoo.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monlau.zoo.repositorio.AnimalRepositorio;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServicio {
    @Autowired
    private AnimalRepositorio animalRepositorio;
    public List<AnimalWithCuidadorIdDTO>listarAnimales() {
        return animalRepositorio.findAll()
                .stream()
                .map(animal -> new AnimalWithCuidadorIdDTO(
                        animal.getId(),
                        animal.getNombre(),
                        animal.getEspecie(),
                        animal.getSalud(),
                        (animal.getCuidador() != null) ? animal.getCuidador().getId() : null
                ))
                .collect(Collectors.toList());
    }

    public void guardarAnimal(Animal animal){
        animalRepositorio.save(animal);
    }

    public void eliminarAnimal(Integer id){
        animalRepositorio.deleteById(id);
    }

}
