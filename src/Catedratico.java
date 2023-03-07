package src;

public class Catedratico {
    private String rfc,nombre;

    public Catedratico() {
    }

    public Catedratico(String rfc, String nombre) {
        this.rfc = rfc;
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Catedratico{" +
                "rfc='" + rfc + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
