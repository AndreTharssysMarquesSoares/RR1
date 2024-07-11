package forma;

public class Retangulo extends Forma {
    
    private double lado;
    private double altura;

    Retangulo(Double lado, Double altura) {
        super();
        this.altura = altura;
        this.lado = lado;
    }

    public double area() {
        return this.altura * this.lado;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(Double newAltura) {
        this.altura = newAltura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(Double newLado) {
        this.lado = newLado;
    }
}