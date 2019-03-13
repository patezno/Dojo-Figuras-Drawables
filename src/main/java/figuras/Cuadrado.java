package figuras;

import draw.Drawable;

public class Cuadrado extends FiguraGeometrica implements Drawable {

    // Atributos

    private double lado = 0d;

    // Constructores

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    // Setters

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Getters

    public double getLado() {
        return lado;
    }

    // Metodos

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

}
