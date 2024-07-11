package forma;

public class Triangulo {
    
    private double base;
    private double altura;

    Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double newBase) {
        this.base = newBase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double newAltura) {
        this.altura = newAltura;
    }
}
