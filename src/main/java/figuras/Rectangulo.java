package figuras;

import draw.Drawable;

public class Rectangulo extends FiguraGeometrica implements Drawable {

    // Atributos

    private double base = 0d;
    private double altura = 0d;

    // Constructores

    public Rectangulo() {
        super();
    }

    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Setters

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Metodos

    @Override
    public double area() {
        return getBase() * getAltura();
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
