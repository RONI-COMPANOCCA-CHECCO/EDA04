public class Turista<T> {
    private String nombre;
    private T documento;

    public Turista(String nombre, T documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public T getDocumento() {
        return documento;
    }

    public String toString() {
        return "Turista{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                '}';
    }
}
