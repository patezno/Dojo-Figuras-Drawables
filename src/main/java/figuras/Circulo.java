package figuras;

import draw.Drawable;

public class Circulo extends FiguraGeometrica implements Drawable {

    // Atributos

    private int radio = 0;
    private final double PI = Math.PI;

    // Constructores

    public Circulo() {
        super();
    }

    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    // Setters

    public void setRadio(int radio) {
        this.radio = radio;
    }

    // Getters

    public int getRadio() {
        return radio;
    }

    // Metodos

    @Override
    public double area() {
        return PI * Math.pow(getRadio(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Esto es un: " + this.getNombre());
    }

    @Override
    public void applyTheme() {
        System.out.println("Aplicado un tema a: " + this.getNombre());
    }
}
