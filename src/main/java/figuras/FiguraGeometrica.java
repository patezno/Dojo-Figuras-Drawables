package figuras;

public abstract class FiguraGeometrica {

    // Atributos

    private String nombre = null;

    // Constructores

    public FiguraGeometrica() {
        this.nombre = "Desconocido";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    // OCP

    public abstract double area();

}
