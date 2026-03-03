public class TrianguloRectangulo extends Figura implements Redimensionable {

    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(String id, String color, double cateto1, double cateto2) {
        super(id, color);
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    @Override
    public double calcularArea() {
        return (cateto1 * cateto2) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        return cateto1 + cateto2 + hipotenusa;
    }

    @Override
    public void redimensionar(double factor) {
        cateto1 *= factor;
        cateto2 *= factor;
    }
}
