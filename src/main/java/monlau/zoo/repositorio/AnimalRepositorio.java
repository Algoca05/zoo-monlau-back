package monlau.zoo.repositorio;

import monlau.zoo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AnimalRepositorio extends JpaRepository<Animal, Integer> {


}
