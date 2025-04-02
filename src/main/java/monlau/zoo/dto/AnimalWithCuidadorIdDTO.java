package monlau.zoo.dto;

import lombok.Data;

@Data
public class AnimalWithCuidadorIdDTO {
    private Integer id;
    private String nombre;
    private String especie;
    private Integer salud;
    private Integer cuidadorId;

    public AnimalWithCuidadorIdDTO(Integer id, String nombre, String especie, Integer salud, Integer cuidadorId) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.salud = salud;
        this.cuidadorId = cuidadorId;
    }
}
