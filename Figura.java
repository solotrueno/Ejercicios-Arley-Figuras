public abstract class Figura {

    protected String id;
    protected String color;

    public Figura(String id, String color) {
        this.id = id;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("---------------------------");
    }
}
