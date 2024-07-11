package forma;

public class Quadrado extends Forma {
    
    private double lado;

    Quadrado(Double lado) {
        super();
        this.lado = lado;
    }

    public double area() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(Double newLado) {
        this.lado = newLado;
    }
}
