package arrayList;

import java.util.Objects;

public class Contactos {

    private String nombre;
    private String telefono;

    public Contactos() {
        this.nombre ="";
        this.telefono="";
    }

    public Contactos(String nombre,String telefono) {
        this.nombre = nombre;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //para que salga solo el nombre y el telefono y no un codigo al lado
    @Override
    public String toString() {
        return "Contactos{" +
                "nombre:'" + nombre + '\'' +
                ", telefono:'" + telefono + '\'' +
                '}';
    }

    //metodo muy recomendable para hacer un arrayList para buscar alguna busqueda (es el metodo equals/hash Code)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contactos contactos = (Contactos) o;
        return Objects.equals(nombre, contactos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
