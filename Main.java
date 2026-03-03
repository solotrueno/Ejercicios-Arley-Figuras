public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo("C1", "Rojo", 5);
        figuras[1] = new Rectangulo("R1", "Azul", 4, 6);
        figuras[2] = new TrianguloRectangulo("T1", "Verde", 3, 4);

        System.out.println("=== FIGURAS ORIGINALES ===");
        for (Figura f : figuras) {
            f.mostrar();
        }

        System.out.println("=== REDIMENSIONANDO (factor 2.0) ===");
        for (Figura f : figuras) {
            if (f instanceof Redimensionable) {
                ((Redimensionable) f).redimensionar(2.0);
            }
        }

        System.out.println("=== FIGURAS DESPUÉS DE REDIMENSIONAR ===");
        for (Figura f : figuras) {
            f.mostrar();
        }
    }
}
