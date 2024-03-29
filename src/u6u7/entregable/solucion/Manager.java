package u6u7.entregable;

import java.io.Serializable;

public class Manager implements Serializable {
    private String nombre;
    private String telefono;

    public Manager(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Managers{" +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
