package monlau.zoo.controller;

import lombok.RequiredArgsConstructor;
import monlau.zoo.model.Cuidador;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import monlau.zoo.servicio.CuidadorServicio;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CuidadorController {
    private final CuidadorServicio cuidadorServicio;

    @GetMapping("/cuidadores")
    public List<Cuidador> listarCuidadores() {
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

    @PutMapping("/cuidadores/{id}")
    public ResponseEntity<?> editarCuidador(@RequestBody Cuidador cuidador, @PathVariable Integer id) {
        try {
            Cuidador cuidadorExistente = cuidadorServicio.obtenerCuidadorPorId(id);
            cuidadorExistente.setNombre(cuidador.getNombre());
            cuidadorServicio.guardarCuidador(cuidadorExistente);
            return new ResponseEntity<>(cuidador, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
