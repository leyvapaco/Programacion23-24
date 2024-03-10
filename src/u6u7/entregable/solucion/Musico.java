package u6u7.entregable;

import java.io.Serializable;

public class Musico implements Serializable {
    private String nombre;
    private int edad;

    public Musico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return 
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' ;
    }
}
