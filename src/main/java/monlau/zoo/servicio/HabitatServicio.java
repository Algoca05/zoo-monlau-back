package monlau.zoo.servicio;


import monlau.zoo.model.Habitat;
import monlau.zoo.repositorio.HabitatRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitatServicio {
    @Autowired
    private HabitatRepositorio habitatRepositorio;
    public List<Habitat> listarHabitat() {
        return habitatRepositorio.findAll();
    }
    public void guardarHabitat(Habitat habitat){
        habitatRepositorio.save(habitat);
    }
}
