package monlau.zoo.controller;

import lombok.RequiredArgsConstructor;
import monlau.zoo.model.Cuidador;
import org.springframework.web.bind.annotation.*;
import monlau.zoo.servicio.CuidadorServicio;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CuidadorController {
    private final CuidadorServicio cuidadorServicio;

    @GetMapping("/cuidadores")
    public List<Cuidador> listarProductos() {
        return cuidadorServicio.listarCuidador();
    }

    @PostMapping("/cuidadores")
    public void guardarCuidador(@RequestBody Cuidador cuidador){
        cuidadorServicio.guardarCuidador(cuidador);
    }

    @DeleteMapping("/cuidadores/{id}")
    public void borrarCuidador(@PathVariable Integer id) {
        cuidadorServicio.eliminarCuidador(id);
    }
}
