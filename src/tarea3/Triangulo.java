
package tarea3;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, int lado) {
        super(lado);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public double area() {
        return (getBase()*getAltura())/2;
    }

    @Override
    public String nombreFigura() {
        return "Triangulo";
    }
    
    
    
}
