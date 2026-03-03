public class Circulo extends Figura {

    private double radio;

    public Circulo(String id, String color, double radio) {
        super(id, color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
