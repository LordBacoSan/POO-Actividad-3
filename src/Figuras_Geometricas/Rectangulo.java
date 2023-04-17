package Figuras_Geometricas;

public class Rectangulo {
    
    int base, altura;
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        return base * altura;
    }
    
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
