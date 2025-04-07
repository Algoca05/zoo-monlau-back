package monlau.zoo.controller;


import lombok.RequiredArgsConstructor;

import monlau.zoo.model.Habitat;
import monlau.zoo.servicio.HabitatServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HabitatController {

    private final HabitatServicio habitatServicio;

    @GetMapping("/habitats")
    public List<Habitat> listarHabitat() {
        return habitatServicio.listarHabitat();
    }

    @PostMapping("/habitats")
    public void guardarHabitat(@RequestBody Habitat habitat){
        habitatServicio.guardarHabitat(habitat);
    }


}
