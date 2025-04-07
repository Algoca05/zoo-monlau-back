package monlau.zoo.servicio;


import monlau.zoo.model.Cuidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import monlau.zoo.repositorio.CuidadorRepositorio;

import java.util.List;

@Service
public class CuidadorServicio {
    @Autowired
    private CuidadorRepositorio cuidadorRepositorio;
    public List<Cuidador>listarCuidador() {
        return cuidadorRepositorio.findAll();
    }
    public void guardarCuidador(Cuidador cuidador){
        cuidadorRepositorio.save(cuidador);
    }

    public void eliminarCuidador(Integer id) {
        cuidadorRepositorio.deleteById(id);
    }

    public Cuidador obtenerCuidadorPorId(Integer id){
        return cuidadorRepositorio.findById(id).get();
    }
}
