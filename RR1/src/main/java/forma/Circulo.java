package forma;

public class Circulo extends Forma {

    private double raio;

    Circulo(Double raio) {
        super();
        this.raio = raio;
    }

    public double area() {
        return Math.PI * this.raio * this.raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(Double newRaio) {
        this.raio = newRaio;
    }
}