package draw;

import figuras.FiguraGeometrica;

import java.util.ArrayList;

public class Drawables {

    // Metodos

    public static void dibujarDrawables(ArrayList<Drawable> figuras) {

        for (Drawable dibujo : figuras) {
            dibujo.draw();
        }
    }

    public static void aplicarTema(ArrayList<Drawable> figuras) {
        for (Drawable dibujo : figuras) {
            try {
                dibujo.applyTheme();
            } catch (UnsupportedOperationException excepcion) {
                FiguraGeometrica figura = (FiguraGeometrica) dibujo;
                System.out.println(excepcion.getMessage() + " para la figura " + figura.getNombre());
            }
        }
    }
}
